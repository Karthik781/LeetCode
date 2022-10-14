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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) return head;
        int slow=0, fast=1;
        ListNode temp = head;
        ListNode temp2 = null;
        while(temp != null){
               if(fast > n){
                ++slow;
                if(temp2 == null) temp2 = head;
                else temp2 = temp2.next;
            }
            ++fast;
            temp = temp.next;
        }
        if(fast - n == 0)  return null;
        if(fast == 1 ) return head;  
        else{
            if(temp2 == null) return head.next;
            ListNode next = temp2.next.next;
            temp2.next = next;
        }
        return head;
    }
}