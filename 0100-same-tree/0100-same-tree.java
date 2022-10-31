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
        Deque<TreeNode> que = new LinkedList<>();
        que.offerLast(p);
        que.offerLast(q);
        
        while(que.size() != 0){
            TreeNode n1  = que.pollFirst();
            
            TreeNode n2  = que.pollFirst();
            
            if(n1 == null && n2 == null) continue;
            
            if(n1 == null || n2 == null || n1.val != n2.val) return false;
            
            que.offerLast(n1.right);
            que.offerLast(n2.right);
            que.offerLast(n1.left);
            que.offerLast(n2.left);
            
        }
        return true;
    }
}