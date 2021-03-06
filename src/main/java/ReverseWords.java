public class ReverseWords {

    // from https://leetcode.com/problems/reverse-words-in-a-string-iii
    public static String reverseWords(String s) {
        int start = 0;
        int end;
        String rev = "";
        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i) == ' ') {
                end = i-1;
                String partial = reverse(s, start, end);
                rev += partial;
                rev += " ";
                start = i + 1;
            }

        }
        String partial = reverse(s, start, s.length() - 1);
        rev += partial;
        return rev;
    }

    private static String reverse(String s, int start, int end) {
        String rev = "";
        for (int i=end; i>=start; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String test = "Let's take LeetCode contest";
        String rev = reverseWords(test);

        // this should print out s'teL ekat edoCteeL tsetnoc
        System.out.println(rev);
    }
}
