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
    public int maxDepth(TreeNode root) {
        int max = 0;
        if(root == null){
            return 0;
        }
        
        int Rmax = 1 + maxDepth(root.right);
        int Lmax = 1 + maxDepth(root.left);
        max = Math.max(Rmax, Lmax);
        return max;
        
    }
}