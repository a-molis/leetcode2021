import java.util.ArrayList;
import java.util.List;

// From https://leetcode.com/problems/binary-tree-postorder-traversal
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        postorder(root, output);
        return output;
    }

    public static void postorder(TreeNode root, List<Integer> output) {
        if (root == null) {
            return;
        }
        postorder(root.left, output);
        postorder(root.right, output);
        output.add(root.val);
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
