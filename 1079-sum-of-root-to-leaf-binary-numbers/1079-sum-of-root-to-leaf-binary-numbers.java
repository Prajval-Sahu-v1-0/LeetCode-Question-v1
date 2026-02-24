/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return RootToLeaf(root,0,0);
    }

    public int RootToLeaf(TreeNode root, int current, int sum){
         if (root == null) return 0;

        // update path value
        current = (current << 1) | root.val;

        // if leaf, return the number formed
        if (root.left == null && root.right == null) {
            return current;
        }

        // inorder-style: left + right
        int leftSum = RootToLeaf(root.left, current, sum);
        int rightSum = RootToLeaf(root.right, current, sum);

        return leftSum + rightSum;
    }
}