/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode newL=null, prev=null, last = head;
        
        while(null != last){
            if(head == last){
                newL = new ListNode(last.val, null);
                prev = newL;
            }else{
                newL = new ListNode(last.val, prev);
                prev = newL;
            }
            last = last.next;
        }
        return newL;
    }
}