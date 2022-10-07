package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] actual = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    /*
     * Given an array of strings, return a Map<String, Integer> containing
     * a key for every different string in the array, and the value is that
     * string's length.
     */
    @Test
    void michael_wordLen() {
        String[] strings = {"a", "bb", "ccc"};
        Map<String, Integer> map3 = Map2.wordLen(strings);
        assertEquals(map3.get("a"), 1);
        assertEquals(map3.get("bb"), 2);
        assertEquals(map3.get("ccc"), 3);
    }

}