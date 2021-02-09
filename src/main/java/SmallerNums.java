import java.util.Arrays;

public class SmallerNums {

    // From https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int count = 0;
            for (int j=0; j<nums.length; j++) {
                if (j !=i && nums[j] < nums[i]) {
                    count++;
                }
            }
            output[i] = count;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] test = {8,1,2,2,3};

        // This should be [4,0,1,1,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(test)));;

    }
}
