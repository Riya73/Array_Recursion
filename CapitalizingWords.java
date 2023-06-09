package Array_Recursion;

import java.util.Arrays;

public class CapitalizingWords {
    public static String[] capitalize(String[] words, int index) {
        if (index < 0 || index >= words.length) {
            return new String[0];
        } else {
            String word = words[index];
            String capitalizedWord = word.toUpperCase();
            String[] remaining = capitalize(words, index + 1);
            String[] result = new String[remaining.length + 1];
            result[0] = capitalizedWord;
            System.arraycopy(remaining, 0, result, 1, remaining.length);
            return result;
        }
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "bye-bye"};
        String[] capitalizedWords = capitalize(words, 0);
        System.out.println("Capitalized words: " + Arrays.toString(capitalizedWords));
    }
}
