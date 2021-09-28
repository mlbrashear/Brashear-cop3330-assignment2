package ex38;

import ex27.validateInput;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class filteringTest {

    @Test
    void filterEvenNumbers() {
        //ArrayList<Integer> even = new ArrayList<>();
        //ArrayList<Integer> num = new ArrayList<>();
        int even[] = {2, 4, 6, 8}, num[] = {1, 2, 3, 4, 5, 6, 7, 8};

        assertEquals(even, filtering.filterEvenNumbers(num, 8));
    }
}