package io.firecode;

/**
 * Write a method that takes in an input String and returns true if all the characters in the String are unique and false if there is even a single repeated character.
 * The method should return true if the input is null or empty String.
 * <p>
 * Examples:
 * areAllCharactersUnique("abcde") -> true
 * <p>
 * areAllCharactersUnique("aa") -> false
 * <p>
 * areAllCharactersUnique("") -> true
 * <p>
 * areAllCharactersUnique(null) -> true
 */
public class AllUniqueChars {

    public static void main(String[] args) {
        System.out.println(areAllCharactersUnique("abcde"));
        System.out.println(areAllCharactersUnique("aa"));
        System.out.println(areAllCharactersUnique(""));
        System.out.println(areAllCharactersUnique(null));
    }

    private static boolean areAllCharactersUnique(String str){
        if (str == null || str.length() == 0) return true;

        boolean[] charArray = new boolean[256];
        char[] chars = str.toCharArray();
        for (char character : chars) {
            if (!charArray[character]) {
                charArray[character] = true;
            } else {
                return false;
            }
        }

        return true;
    }
}
