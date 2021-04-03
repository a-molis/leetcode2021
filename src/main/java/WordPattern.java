import java.util.HashMap;

public class WordPattern {


    // from https://leetcode.com/problems/word-pattern
    public static boolean wordPattern(String pattern, String s) {
        if (pattern.length() == 0 && s.length() == 0) {
            return true;
        }
        HashMap<Character, String> patterns = new HashMap<>();
        String[] strs = s.split(" ");

        if (pattern.length() != strs.length) {
            return false;
        }

        for (int i=0; i<pattern.length(); i++) {
            if (patterns.containsKey(pattern.charAt(i))) {
                String comparison = patterns.get(pattern.charAt(i));
                if (!comparison.equals(strs[i])) {

                    return false;
                }

            } else {
                if (patterns.containsValue(strs[i])) {
                    return false;
                }
                patterns.put(pattern.charAt(i), strs[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        // this should print out true
        System.out.println(wordPattern(pattern, s));
    }
}
