package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class targetHRTest {

    @Test
    void thr() {
        assertEquals(138.15, targetHR.thr(22, 65, 55));
    }
}