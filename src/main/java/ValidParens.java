import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParens {

    public static boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        Deque<Character> parens = new ArrayDeque<Character>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                parens.push(s.charAt(i));
            } else {
                if (parens.isEmpty()) {
                    return false;
                }
                char current = parens.pop();
                switch (current) {
                    case '{':
                        if (s.charAt(i) != '}') {
                            return false;
                        }
                        continue;
                    case '(':
                        if (s.charAt(i) != ')') {
                            return false;
                        }
                        continue;
                    case '[':
                        if (s.charAt(i) != ']') {
                            return false;
                        }
                }
            }
        }
        return parens.isEmpty();
    }

    public static void main(String[] args) {
        String test0 = "()";
        System.out.println(isValid(test0));

        // should be true
        String test1 = "()[]{}";
        System.out.println(isValid(test1));

        // should be false
        String test2 = "([)]";
        System.out.println(isValid(test2));
    }
}
