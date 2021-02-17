public class NumberOfSteps {

    // From https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
    public static int numberOfSteps (int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                ++steps;
            } else {
                num -= 1;
                ++steps;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int num = 14;

        // This should print out 6
        System.out.println(numberOfSteps(num));
    }
}
