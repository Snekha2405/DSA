class Solution {
    public static boolean validatebst(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return validatebst(node.left, min, node.val) &&
               validatebst(node.right, node.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return validatebst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
