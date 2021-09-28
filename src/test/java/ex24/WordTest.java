package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    @DisplayName("Find if two words are Anagrams")
    void isAnagram() {
        assertEquals(1, Word.isAnagram("note", "tone"));
        assertEquals(1, Word.isAnagram("tar", "rat"));
        assertEquals(0, Word.isAnagram("low", "note"));
    }
}