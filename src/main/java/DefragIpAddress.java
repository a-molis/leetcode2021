public class DefragIpAddress {

    // https://leetcode.com/problems/defanging-an-ip-address
    public static String defangIPaddr(String address) {
        StringBuilder output = new StringBuilder();
        for (int i=0; i<address.length(); i++) {
            if (address.charAt(i) == '.') {
                output.append("[.]");
            } else {
                output.append(address.charAt(i));
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String test = "1.1.1.1";

        // this should output "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr(test));
    }


}
