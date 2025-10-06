class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1;   // left subtree not balanced

        int right = checkHeight(root.right);
        if (right == -1) return -1;  // right subtree not balanced

        if (Math.abs(left - right) > 1)
            return -1;               // current node not balanced

        return 1 + Math.max(left, right);  // return height
    }
}
