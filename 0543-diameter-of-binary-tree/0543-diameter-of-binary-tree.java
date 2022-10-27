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
    int max = -1;
    public int diameterOfBinaryTree(TreeNode root) {
         findMax(root);
        return max;
    }
    private int findMax(TreeNode root){
        if(root == null){
            return -1;
        }
        
        int R = 1 + findMax(root.right);
        int L = 1 + findMax(root.left);
        max = Math.max(max , (R+ L));
        return Math.max(R, L);
    }
}