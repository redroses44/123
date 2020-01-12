package payment;

import money.Money;

import java.util.Date;

public class Payment {

    private Date dateMade;
    private Date dateReceived;
    private Date dateDue;
    private Date dateCleared;
    private PaymentMethod method;
    private Money money;

    public Payment(Date dateMade, Date dateReceived, Date dateDue, Date dateCleared, PaymentMethod method, Money money) {
        this.dateMade = dateMade;
        this.dateReceived = dateReceived;
        this.dateDue = dateDue;
        this.dateCleared = dateCleared;
        this.method = method;
        this.money = money;
    }

    public Date getDateCleared() {
        return dateCleared;
    }

    public boolean canPay(Money mon) {
        return this.money.getCurrency().getQuantity().greaterThan(mon.getCurrency().getQuantity());
    }

    public Money pay(Money mon) {
        if(canPay(mon)) {
            this.money.getCurrency().setQuantity(this.money.getCurrency().getQuantity().subtract(mon.getCurrency().getQuantity()));
        } else {
            throw new Error("Not enough money to pay!");
        }
        return this.money;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "dateMade=" + dateMade +
                ", dateReceived=" + dateReceived +
                ", dateDue=" + dateDue +
                ", dateCleared=" + dateCleared +
                ", method=" + method +
                ", money=" + money +
                '}';
    }
}
