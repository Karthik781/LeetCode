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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if(p != null) st1.push(p);
        if(q != null) st2.push(q);

        
        while(!st1.isEmpty() && !st2.isEmpty()){
            TreeNode n1 = st1.pop();
            TreeNode n2 = st2.pop();
             
            if(n1.val != n2.val) return false;
            
            if(n1.right != null ) st1.push(n1.right);
            if(n2.right != null)  st2.push(n2.right);
            if(st1.size() != st2.size()) return false;
            
            if(n1.left != null) st1.push(n1.left);
            if(n2.left != null) st2.push(n2.left);
            if(st1.size() != st2.size()) return false;
        }
        
        if(st1.size() != st2.size()) {
            return false;
        }
       
        return true;
        
    }
}