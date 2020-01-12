package quantity;

public class Quantity {
    private double amount;

    public Quantity(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Quantity add(Quantity quantity) {
        this.amount += quantity.amount;
        return this;
    }

    public Quantity subtract(Quantity quantity) {
        this.amount -= quantity.amount;
        return this;
    }

    public Quantity multiple(float amount) {
        this.amount *= amount;
        return this;
    }

    public Quantity multiple(Quantity quantity) {
        this.amount *= quantity.amount;
        return this;
    }

    public Quantity divide(Quantity quantity) {
        this.amount /= quantity.amount;
        return this;
    }

    public Quantity divide(float amount) {
        this.amount /= amount;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Quantity)) {
            return false;
        }
        Quantity quantity = (Quantity) obj;
        return this.amount == quantity.amount;

    }

    public Boolean equalTo(Quantity quantity) {
        return this.equals(quantity);
    }

    public Boolean greaterThan(Quantity quantity) {
        return this.amount > quantity.amount;
    }

    public Boolean lessThan(Quantity quantity) {
        return this.amount < quantity.amount;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "amount=" + amount +
                '}';
    }
}
