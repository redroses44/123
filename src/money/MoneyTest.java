package money;

import currency.Currency;
import currency.ISOCurrency;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import quantity.Quantity;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    private Money money;
    private Currency currency;
    private Currency currency2;

    @Before
    void setUp() {
        Quantity quantity = new Quantity(100.0);
        Quantity quantity1 = new Quantity(50.0);
        currency = new ISOCurrency("testcur", quantity, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
        currency2 = new ISOCurrency("tesur", quantity1, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "c123");
        money = new Money(currency);
    }

    @Test
    void getCurrency() {
        setUp();
        assertEquals(money.getCurrency(), currency);
    }

    @Test
    void setCurrency() {
        setUp();
        money.setCurrency(currency2);
        assertEquals(money.getCurrency(), currency2);
    }
}