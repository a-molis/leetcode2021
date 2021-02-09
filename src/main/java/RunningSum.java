import java.util.Arrays;

public class RunningSum {

    // From https://leetcode.com/problems/running-sum-of-1d-array
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] sums = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            sums[i] = sum;
        }
        return sums;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};

        // This should print out 1,3,6,10
        System.out.println(Arrays.toString(runningSum(test)));

    }
}
