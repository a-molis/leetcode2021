public class RangeSumBST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int right = rangeSumBST(root.right, low, high);
        int left = rangeSumBST(root.left, low, high);
        if (root.val >= low && root.val <= high) {
            return root.val + right + left;
        } else {
            return right + left;
        }

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
        //[10,5,15,3,7,null,18]
        //[3, 5, 7, 10, 15, 18]

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(3);

        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);

        // this should print out 32
        System.out.println(rangeSumBST(root, 7, 15));


    }
}
