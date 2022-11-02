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
    int count = 0;
    int max = 0;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return max;
    }
    
    private void dfs(TreeNode root, int k){
        if(root == null) return;
        
        kthSmallest(root.left, k);
        
        if(++count == k) {
            max = root.val;
            return;
        }
        
        kthSmallest(root.right, k);
    }
}