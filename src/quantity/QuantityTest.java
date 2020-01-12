package quantity;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    private Quantity quantity;
    private Quantity quantity1;
    private Quantity quantity2;
    private Quantity quantity4;
    private Quantity testQuantity;

    @Before
    void setUp() {
        quantity = new Quantity(10.0);
        testQuantity = new Quantity(10.0);
        quantity1 = new Quantity(20.0);
        quantity2 = new Quantity(30.0);
        quantity4 = new Quantity(200.0);
    }

    @Test
    void getAmount() {
        setUp();
        assertEquals(quantity.getAmount(), 10.0);
    }

    @Test
    void add() {
        setUp();
        assertEquals(quantity.add(quantity1), quantity2);
    }

    @Test
    void subtract() {
        setUp();
        assertEquals(quantity2.subtract(quantity1), quantity);
    }

    @Test
    void multiple() {
        setUp();
        assertEquals(quantity.multiple(2f), quantity1);
    }

    @Test
    void testMultiple() {
        setUp();
        assertEquals(quantity.multiple(quantity1), quantity4);
    }

    @Test
    void divide() {
        setUp();
        assertEquals(quantity4.divide(20f), quantity);
    }

    @Test
    void testDivide() {
        setUp();
        assertEquals(quantity4.divide(quantity1), quantity);
    }

    @Test
    void equalTo() {
        setUp();
        assertEquals(quantity, testQuantity);
    }

    @Test
    void greaterThan() {
        setUp();
        assertTrue(quantity4.greaterThan(quantity1));
    }

    @Test
    void lessThan() {
        setUp();
        assertTrue(quantity.lessThan(quantity4));
    }
}