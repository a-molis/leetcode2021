import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


// From https://leetcode.com/problems/sum-of-unique-elements
public class SumOfUnique {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> uniqueNums = new HashMap<>();


        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (uniqueNums.containsKey(num)) {
                uniqueNums.put(num, (uniqueNums.get(num) + 1));
            } else {
                uniqueNums.put(num, 1);
            }
        }
        int output = 0;
        for (Map.Entry<Integer, Integer> entry: uniqueNums.entrySet()) {
            if (entry.getValue() == 1) {
                output += entry.getKey();
            }

        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));

    }
}
