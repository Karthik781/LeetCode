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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        Deque<TreeNode> q2 = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return new ArrayList<>();
        
        q.offerFirst(root);
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            while(!q.isEmpty()){
                TreeNode tmp = q.pollFirst();
                list.add(tmp.val);
                q2.offerLast(tmp);
            }
            res.add(list);
            
            while(!q2.isEmpty()){
            TreeNode tmp = q2.pollFirst();
            if(tmp.left != null){
                q.offerLast(tmp.left);
            }
            if(tmp.right != null){
                q.offerLast(tmp.right);
            }
               
        }
        }
        
        return res;
    }
}