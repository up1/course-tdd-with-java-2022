package testdouble;

public class CreditCardRate implements PaymentFee {

    private final PaymentGateway paymentGateway;

    public CreditCardRate(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public int feeRate(String name) {
        String feeRate = paymentGateway.rateFor(name);
        return Integer.parseInt(feeRate);
    }
}
