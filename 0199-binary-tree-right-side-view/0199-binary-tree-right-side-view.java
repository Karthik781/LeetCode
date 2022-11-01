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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfs(res, root, 0);
        return res;
    }
    
    private void dfs(List<Integer> res, TreeNode root, int level){
        if(root == null) return;
        if(level == res.size()) 
            res.add(0);
        res.set(level, root.val);
        dfs(res, root.left, level + 1);
        dfs(res, root.right, level + 1);
    }
}