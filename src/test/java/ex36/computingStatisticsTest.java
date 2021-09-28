package ex36;

import ex27.validateInput;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class computingStatisticsTest {

    @Test
    void average() {
        computingStatistics s = new computingStatistics();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(400.0, computingStatistics.average(num));
    }

    @Test
    void max() {
        computingStatistics s = new computingStatistics();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(1000, computingStatistics.max(num));
    }

    @Test
    void min() {
        computingStatistics s = new computingStatistics();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(100, computingStatistics.min(num));
    }

    @Test
    void std() {
        computingStatistics s = new computingStatistics();
        ArrayList<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");
        assertEquals(354.0, computingStatistics.std(num));
    }
}