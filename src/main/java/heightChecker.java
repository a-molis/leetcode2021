import java.util.Arrays;

public class heightChecker {

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] copy = Arrays.copyOf(heights, heights.length);

        // might be better if not using buble sort
        for (int i = 0; i < heights.length; i++) {
            for (int j=1; j<heights.length; j++) {
                if (heights[j-1] >heights[j]) {
                    int temp = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp;
                    String foo = "";
                }
            }
        }

        for (int i=0; i<heights.length; i++) {
            if (heights[i] != copy[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = { 1,1,4,2,1,3 };
        System.out.println(heightChecker(array));;

    }
}
