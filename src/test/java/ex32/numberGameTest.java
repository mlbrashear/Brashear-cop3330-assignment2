package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

    @Test
    void level1() {
        assertEquals(1, numberGame.diff1());
    }

    @Test
    void level2() {
        assertEquals(1, numberGame.diff2());
    }

    @Test
    void level3() {
        assertEquals(1, numberGame.diff3());
    }
}