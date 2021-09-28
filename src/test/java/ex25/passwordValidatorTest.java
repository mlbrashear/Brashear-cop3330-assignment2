package ex25;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidatorTest {

    @Test
    void password() {
        assertEquals(0, passwordValidator.password("12345"));
        assertEquals(1, passwordValidator.password("asdfg"));
        assertEquals(2, passwordValidator.password("abc123xyz"));
        assertEquals(3, passwordValidator.password("1337h@xor!"));
    }
}