package currency;

import money.Money;
import quantity.Quantity;
import rate.ExchangeRate;
import rate.ExchangeRateType;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    private Quantity quantity = new Quantity(100.0);

    private Currency currency = new ISOCurrency("testcur", quantity, "testdef",
            "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
    private Money money = new Money(currency);
    private ExchangeRateType type = new ExchangeRateType("test type", new Date());
    private ExchangeRate rate = new ExchangeRate(1.5f, new Date(), type);
    private CurrencyConverter converter = new CurrencyConverter();

    @org.junit.jupiter.api.Test
    void exchange() {
        converter.exchange(money, rate);
        assertEquals(money.getCurrency().getQuantity(), 150);
    }
}