public class GoalParser {

    // Original problem from https://leetcode.com/problems/goal-parser-interpretation/
    public static String interpret(String command) {
        StringBuilder output = new StringBuilder();
        for (int i=0; i<command.length(); i++) {
            Character current = command.charAt(i);
            if (current == 'G') {
                output.append("G");
            }
            if (current == '(') {
                Character next = command.charAt(i+1);
                if (next == 'a') {
                    output.append("al");
                } else {
                    output.append("o");
                }
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String test = "G()()()()(al)";

        // this should print "Gooooal"
        System.out.println(interpret(test));
    }
}
