package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOf() {
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOf(5000, 12, 100));
    }
}