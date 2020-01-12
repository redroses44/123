package payment;

public abstract class PaymentMethod {
    private String methodName;

    protected PaymentMethod(String methodName) {
        this.methodName = methodName;
    }

    public PaymentMethod() {

    }
}
