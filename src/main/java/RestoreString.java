public class RestoreString {

    // from https://leetcode.com/problems/shuffle-string
    public static String restoreString(String s, int[] indices) {
        char[] shuffle = new char[indices.length];

        for (int i=0; i<indices.length; i++) {
            shuffle[indices[i]] = s.charAt(i);
        }

        return String.valueOf(shuffle);


        //c o d e l e e t
        //4 5 6 7 0 2 1 3
    }

    public static void main(String[] args) {
        String test = "codeleet";
        int[] testArray = {4,5,6,7,0,2,1,3};

        // should print out leetcode
        System.out.println(restoreString(test, testArray));
    }
}
