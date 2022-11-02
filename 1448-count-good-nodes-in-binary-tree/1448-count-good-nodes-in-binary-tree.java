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
    public int goodNodes(TreeNode root) {
        int curMax = Integer.MIN_VALUE;
        return dfs(root, curMax);
       
    }
    private int dfs(TreeNode root, int curMax){
        if(root == null) return 0;
        
        int goodCount = 0;
        if(root.val >= curMax){
            goodCount = 1;
            curMax = root.val;
        }
        goodCount += dfs(root.left, curMax);
        goodCount += dfs(root.right, curMax);
        
        return goodCount;
    }
}