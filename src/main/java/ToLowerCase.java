public class ToLowerCase {

    // from https://leetcode.com/problems/to-lower-case
    public static String toLowerCase(String str) {
        StringBuilder output = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char letter = str.charAt(i);
            int letterNum = Integer.valueOf(letter);

            if (letterNum >= 65 && letterNum <= 90) {
                output.append((Character.toString((char) letter + 32)));
            } else {
                output.append(str.charAt(i));
            }
        }
        return output.toString();
    }


    public static void main(String[] args) {
        String test = "Hello";

        // Should print out "hello"
        System.out.println(toLowerCase(test));
    }
}
