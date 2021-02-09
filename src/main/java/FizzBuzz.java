import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

    // from https://leetcode.com/problems/fizz-buzz/
    public static List<String> fizzBuzz(int n) {

        List<String> outputList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int num = i+1;
            StringBuilder temp = new StringBuilder();
            if (num % 3 == 0) {
                temp.append("Fizz");
            }
            if (num % 5 == 0) {
                temp.append("Buzz");
            }
            if (temp.length() > 0) {
                outputList.add(temp.toString());
            } else {
                outputList.add(String.valueOf(num));
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(fizzBuzz(n));
    }
}
