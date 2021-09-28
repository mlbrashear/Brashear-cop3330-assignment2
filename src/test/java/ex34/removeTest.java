package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeTest {

    @Test
    void removeName() {
        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        assertEquals(2, remove.removeName(names, "Chris Jones"));
    }
}