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
        Deque<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        
        if(root == null) return new ArrayList<>();
        
        q.offerFirst(root);
        
        while(!q.isEmpty()){ 
            int len = q.size();
            res.add(q.peekLast().val);
            while(len > 0){
                TreeNode tmp = q.pollFirst();
                if(tmp.left != null){
                    q.offerLast(tmp.left);
                }
                if(tmp.right != null){
                    q.offerLast(tmp.right);
                }
                len--;
            }
        }
        
        return res;
    }
}