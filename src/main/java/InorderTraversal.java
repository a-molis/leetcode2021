import java.util.*;

// https://leetcode.com/problems/binary-tree-inorder-traversal
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        inorder(root, output);
        return output;
    }

    public static void inorder(TreeNode root, List<Integer> output) {
        if (root == null) {
            return;
        }
        inorder(root.left, output);
        output.add(root.val);
        inorder(root.right, output);
    }

    // Tree node class is from leetcode
    public class TreeNode {
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
}
