import java.util.HashSet;


public class JewelsInStones {

    // Original Problem from https://leetcode.com/problems/jewels-and-stones
    public static int numJewelsInStones(String jewels, String stones) {
        if (jewels.length() == 0 || stones.length() == 0) {
            return 0;
        }

        HashSet<Character> jewelComps = new HashSet<>();

        for (int i=0; i<jewels.length(); i++) {
            jewelComps.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i=0; i<stones.length(); i++) {
            if (jewelComps.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        // This should be 3
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
