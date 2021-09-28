package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class randomTest {

    @Test
    void rand() {
        int random_int = (int)Math.floor(Math.random()*(4-1+1)+1);
        assertEquals(random_int, random.rand());
    }
}