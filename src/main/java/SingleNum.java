public class SingleNum {

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (Integer num: nums) {
            // if you xor 0 by a number it will turn into that number.
            // if you xor that number by itself it will turn into 0
            // Therefore the last number left in single will be the only single num
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] test = {1, 1, 2, 3, 3, 4, 4};

        // This should equal to 2
        System.out.println(singleNumber(test));
    }
}
