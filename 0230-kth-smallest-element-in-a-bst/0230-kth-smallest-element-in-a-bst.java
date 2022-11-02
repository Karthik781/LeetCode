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
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> q = new LinkedList<>();

        while(root!= null || !q.isEmpty()){
            if(root!= null){
                q.offerFirst(root);
                root = root.left;
            }else{
                 root = q.pollFirst();
                if(--k == 0){
                    break;
                  
                }
                 root = root.right;
            }
            
        }
        return root.val;
    }
}