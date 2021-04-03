public class UnivalTree {


    // From https://leetcode.com/problems/univalued-binary-tree/
    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.left.val != root.val) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.right.val != root.val) {
                return false;
            }
        }

        return isUnivalTree(root.right) && isUnivalTree(root.left);
    }





    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;


        // this should print out true
        System.out.println(isUnivalTree(t1));

        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(2);
        t4.left = t5;
        t4.right = t6;

        // this should print out false
        System.out.println(isUnivalTree(t4));
    }
}
