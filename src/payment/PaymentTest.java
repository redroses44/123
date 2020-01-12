package payment;

import currency.Currency;
import currency.ISOCurrency;
import money.Money;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import quantity.Quantity;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private Quantity quantity;
    private Quantity quantity1;
    private Quantity quantity3;
    private Currency currency;
    private Currency currency1;
    private Money money;
    private Money money1;
    private PaymentMethod method;
    private Payment payment;

    @Before
    void setUp() {
         quantity = new Quantity(40.0);
         quantity1 = new Quantity(100.0);
         quantity3 = new Quantity(60.0);
         currency = new ISOCurrency("testcur", quantity, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
         currency1 = new ISOCurrency("testcurr2", quantity1, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
         money = new Money(currency);
         money1 = new Money(currency1);
         method = new DebitCard(money);
         payment = new Payment(new Date(), new Date(), new Date(), new Date(), method, money1);
    }

    @Test
    void canPay() {
        setUp();
        assertFalse(payment.canPay(money1));
        assertTrue(payment.canPay(money));
    }

    @Test
    void pay() {
        setUp();
        assertEquals(payment.pay(money).getCurrency().getQuantity(), quantity3);
    }
}