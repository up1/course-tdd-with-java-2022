package testdouble;

interface Logger {
    void append(String message);
}

interface PaymentFee {
    int feeRate(String name);
}

interface PaymentEmailSender {
    void send(PaymentRequest paymentRequest);
}

interface PaymentGateway {
    String rateFor(String name);
}

public class PaymentService {

    private Logger logger;
    private PaymentFee paymentFee;
    private PaymentEmailSender paymentEmailSender;

    public PaymentService(Logger logger) {
        this.logger = logger;
    }

    public PaymentService(Logger logger, PaymentFee paymentFee) {
        this.logger = logger;
        this.paymentFee = paymentFee;
    }

    public PaymentService(Logger logger, PaymentFee paymentFee, PaymentEmailSender paymentEmailSender) {
        this.logger = logger;
        this.paymentFee = paymentFee;
        this.paymentEmailSender = paymentEmailSender;
    }

    public PaymentRequest createPayment(Order order, CreditCard creditCard) {
        logger.append("Create payment for order " + order.toString());
        int fee = paymentFee.feeRate(creditCard.getName());
        PaymentRequest paymentRequest = new PaymentRequest(order.getPrice(), fee);
        paymentEmailSender.send(paymentRequest);
        return paymentRequest;
    }
}
