package testdouble;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoggerDummy implements Logger {

    @Override
    public void append(String message) {
        // Do not thing
    }
}

class PaymentFeeStub implements PaymentFee {

    @Override
    public int feeRate(String name) {
        return 100;
    }
}

class PaymentEmailSenderSpy implements PaymentEmailSender {

    List<PaymentRequest> paymentRequestList = new ArrayList<>();

    @Override
    public void send(PaymentRequest paymentRequest) {
        paymentRequestList.add(paymentRequest);
    }

    public int timesCalled() {
        return paymentRequestList.size();
    }

    public boolean calledWithPaymentRequest(PaymentRequest paymentRequest) {
        return paymentRequestList.contains(paymentRequest);
    }
}

class PaymentEmailSenderMock implements PaymentEmailSender {

    List<PaymentRequest> paymentRequestList = new ArrayList<>();
    List<PaymentRequest> expectedRequestList = new ArrayList<>();

    @Override
    public void send(PaymentRequest paymentRequest) {
        paymentRequestList.add(paymentRequest);
    }

    public void setExpectedRequestList(PaymentRequest paymentRequest) {
        expectedRequestList.add(paymentRequest);
    }

    public void verify() {
        assertEquals(expectedRequestList, paymentRequestList);
    }
}


class PaymentServiceTest {

    @Test
    public void working_with_dummy() {
        // Arrange
        Logger logger = new LoggerDummy();
        PaymentService paymentService = new PaymentService(logger);

        // Act and assert

    }

    @Test
    public void working_with_stub() {
        // Arrange
        Logger logger = new LoggerDummy();
        PaymentFee paymentFee = new PaymentFeeStub();
        PaymentService paymentService = new PaymentService(logger, paymentFee);

        // Act
        PaymentRequest paymentRequest = paymentService.createPayment(new Order(100), new CreditCard());

        // Assert
        assertEquals(200, paymentRequest.getTotalPrice());
    }

    @Test
    public void working_with_spy() {
        // Arrange
        Logger logger = new LoggerDummy();
        PaymentFee paymentFee = new PaymentFeeStub();
        PaymentService paymentService = new PaymentService(logger, paymentFee);
        PaymentEmailSenderSpy emailSender = new PaymentEmailSenderSpy();

        // Act
        PaymentRequest paymentRequest = paymentService.createPayment(new Order(100), new CreditCard());

        // Assert
        assertEquals(1, emailSender.timesCalled());
        assertTrue(emailSender.calledWithPaymentRequest(paymentRequest));
    }

    @Test
    public void working_with_mock() {
        // Arrange
        Logger logger = new LoggerDummy();
        PaymentFee paymentFee = new PaymentFeeStub();
        PaymentService paymentService = new PaymentService(logger, paymentFee);
        PaymentEmailSenderMock emailSender = new PaymentEmailSenderMock();
        PaymentRequest expectedRequest = new PaymentRequest(1000, 10);

        // Act
        PaymentRequest paymentRequest = paymentService.createPayment(new Order(1000), new CreditCard());

        // Assert
        emailSender.setExpectedRequestList(expectedRequest);
        emailSender.verify();
    }

}