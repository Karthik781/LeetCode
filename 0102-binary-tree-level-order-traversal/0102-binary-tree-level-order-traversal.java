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
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return new ArrayList<>();
        
        q.offerFirst(root);
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = q.size();
            while(len > 0){
                TreeNode tmp = q.pollFirst();
                list.add(tmp.val);
                if(tmp.left != null){
                    q.offerLast(tmp.left);
                }
                if(tmp.right != null){
                    q.offerLast(tmp.right);
                }
                len--;
            }
            res.add(list);
            
        }
        
        return res;
    }
}