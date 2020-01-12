package currency;

import locale.Locale;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import quantity.Quantity;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {

    private Currency currency;

    @Before
    void setUp() {
        Quantity quantity = new Quantity(40.0);
         currency = new ISOCurrency("testcur", quantity, "testdef",
                "21dqq42", 3913931, "20kcwk", "30fkqad", new Date(), new Date(), 12f, "abc123");
    }

    @Test
    void getQuantity() {
        setUp();
        Quantity quantity = new Quantity(40.0);
        assertEquals(currency.getQuantity(), quantity);
    }

    @Test
    void setAmount() {
        setUp();
        Quantity quantity = new Quantity(500.0);
        currency.setQuantity(quantity);
        assertEquals(currency.getQuantity(), quantity);
    }

    @Test
    void getName() {
        setUp();
        assertEquals(currency.getName(), "testcur");
    }

    @Test
    void getAlphabeticCode() {
        setUp();
        assertEquals(currency.getAlphabeticCode(), "21dqq42");
    }

    @Test
    void getNumericCode() {
        setUp();
        assertEquals(currency.getNumericCode(), 3913931);
    }

    @Test
    void getMinorUnitSymbol() {
        setUp();
        assertEquals(currency.getMinorUnitSymbol(), "30fkqad");
    }

    @Test
    void getExpirationDate() {
        setUp();
        assertEquals(currency.getExpirationDate(), new Date());
    }

    @Test
    void getIntroductionDate() {
        setUp();
        assertEquals(currency.getIntroductionDate(), new Date());
    }

    @Test
    void getRatioOfMinorUnitToMajorUnit() {
        setUp();
        assertEquals(currency.getRatioOfMinorUnitToMajorUnit(), 12f);
    }

    @Test
    void getDefinition() {
        setUp();
        assertEquals(currency.getDefinition(), "testdef");
    }

    @Test
    void getMajorUnitSymbol() {
        setUp();
        assertEquals(currency.getMajorUnitSymbol(), "20kcwk");
    }

    @Test
    void isCurrencyAccepted() {
        setUp();
        Locale locale = new Locale("testName", "testDesc");
        assertFalse(currency.isCurrencyAccepted(locale));
        currency.addLocale(locale);
        assertTrue(currency.isCurrencyAccepted(locale));
    }

    @Test
    void addLocale() {
        setUp();
        Locale locale = new Locale("testName", "testDesc");
        currency.addLocale(locale);
        assertEquals(currency.getLocales(), List.of(locale));

    }

    @Test
    void getLocales() {
        setUp();
        Locale locale1 = new Locale("testName", "testDesc");
        Locale locale2 = new Locale("testName2", "testDesc2");
        currency.addLocale(locale1);
        currency.addLocale(locale2);
        System.out.println(currency.getLocales());
    }
}