package testdouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PaymentGatewayFake implements PaymentGateway {
    @Override
    public String rateFor(String name) {
        if("VISA".equals(name)) {
            return "4";
        } else if("MASTER".equals(name)) {
            return "3";
        }
        return "2";
    }
}

class CreditCardRateTest {

    @Test
    public void working_with_fake() {
        // Arrange
        PaymentGatewayFake paymentGatewayFake = new PaymentGatewayFake();
        CreditCardRate creditCardRate = new CreditCardRate(paymentGatewayFake);

        // Act
        int result = creditCardRate.feeRate("VISA");

        // Assert
        assertEquals(4, result);
    }


}

