package ex29;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class yearTest {
    @Test
    void password() {
        assertEquals(18, year.years(4));
    }

}