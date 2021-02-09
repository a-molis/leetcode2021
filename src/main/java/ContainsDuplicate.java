import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] testArray = {1, 1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(testArray));
    }

    // From https://leetcode.com/problems/contains-duplicate/
    private static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        HashSet<Integer> singleNums = new HashSet<>();
        for (Integer num: nums) {
          if (singleNums.contains(num)) {
              return true;
          } else {
              singleNums.add(num);
          }
        }
        return false;
    }
}
