import java.util.Arrays;

public class MaxWealth {

    // This is from https://leetcode.com/problems/richest-customer-wealth
    public static int maximumWealth(int[][] accounts) {

        Integer richest = Integer.MIN_VALUE;
        for (int r=0; r<accounts.length; r++) {
            int currentWealth = 0;
            for (int c=0; c<accounts[r].length; c++) {
                currentWealth += accounts[r][c];
            }
            if (currentWealth > richest) {
                richest = currentWealth;
            }
        }
        return richest;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,3},{3,2,1}};

        // This should print 6
        System.out.println(maximumWealth(test));
    }
}
