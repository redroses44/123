package money;

import currency.Currency;

public class Money {
    private Currency currency;

    public Money(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "Money{" +
                "currency=" + currency +
                '}';
    }
}
