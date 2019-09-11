package io.firecode;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FirstNonDuplicateChar {

    public static void main(String[] args) {
        assertEquals(firstNonRepeatedCharacter("abcdcd"), new Character('a'));
        assertEquals(firstNonRepeatedCharacter("cdcd"), null);
    }

    private static Character firstNonRepeatedCharacter(String str) {

        if (str == null || str.length() == 0) return null;

        char[] chars = str.toCharArray();

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char aChar : chars) {
            charCount.merge(aChar, 1, (a, b) -> a + b);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return null;
    }
}
