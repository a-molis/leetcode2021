import java.util.HashMap;

public class ArrayStringsAreEqual {

    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddef"};
        System.out.println(arrayStringsAreEqual(word1, word2));

        String[] word3 = {"ab", "c"};
        String[] word4 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word3, word4));

    }

    // from https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1 == null && word2 == null) {
            return true;
        }
        StringBuilder word1Temp = new StringBuilder();
        for (String s: word1) {
            for(int i=0; i<s.length(); i++) {
                word1Temp.append(s.charAt(i));
            }
        }
        String word1Concat = word1Temp.toString();
        StringBuilder word2Temp = new StringBuilder();
        for (String s: word2) {
            for(int i=0; i<s.length(); i++) {
                word2Temp.append(s.charAt(i));
            }
        }
        String word2Concat = word2Temp.toString();
        return word2Concat.equals(word1Concat);
    }
}
