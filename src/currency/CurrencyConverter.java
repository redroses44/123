package currency;

import money.Money;
import quantity.Quantity;
import rate.ExchangeRate;

public class CurrencyConverter {


    public Money exchange(Money money, ExchangeRate rate) {
        Quantity quantity = money.getCurrency().getQuantity().multiple(rate.getRate());
        money.getCurrency().setQuantity(quantity);
        return money;
    }
}
