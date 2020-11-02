package testdouble;

public class PaymentRequest {
    private int totalPrice;
    private int fee;

    public PaymentRequest(int totalPrice, int fee) {
        this.totalPrice = totalPrice;
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
