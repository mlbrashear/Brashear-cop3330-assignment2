package ex27;

import ex25.passwordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validateInputTest {

    @Test
    void fn() {
        assertEquals(0, validateInput.fn("John"));
        assertEquals(1, validateInput.fn("J"));
    }

    @Test
    void ln() {
        assertEquals(0, validateInput.ln("Johnson"));
        assertEquals(1, validateInput.fn(""));
    }

    @Test
    void zipCode() {
        assertEquals(0, validateInput.zipCode("12345"));
        assertEquals(1, validateInput.zipCode("abcde"));
    }

    @Test
    void identification() {
        assertEquals(0, validateInput.identification("AA-1234"));
        assertEquals(1, validateInput.identification("AAB-124"));
    }
}