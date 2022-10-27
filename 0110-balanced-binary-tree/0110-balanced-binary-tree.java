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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int L = height(root.left);
        int R = height(root.right);
        
        if(Math.abs(L -R) > 1) return false;
        
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        
        if(!left || !right) return false;
        
        return true;
    }
    
    private int height(TreeNode root){
        if(root == null) return 0;
        
        int l = 1 + height(root.left);
        int r = 1 + height(root.right);
        
        return Math.max(l, r);
    }
}