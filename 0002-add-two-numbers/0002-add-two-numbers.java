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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode dummy = new ListNode(0);
        head = dummy;
        dummy.next = head;
        int carry = 0;
        while(l1!= null && l2 != null){
            int sum = l1.val + l2.val + carry;
            if(sum > 9){
                sum = sum%10;
                carry = 1;
            }else{
                carry = 0;
            }
            ListNode node = new ListNode(sum);
            head.next = node;
            head = head.next;
            l1 = l1.next; l2 = l2.next;
        }
        if(l2 == null) l2 = l1;
            while(l2 != null){
                int sum = l2.val + carry; 
                if(sum > 9){
                sum = sum%10;
                carry = 1;
            }else{
                carry = 0;
            }
            ListNode node = new ListNode(sum);
            head.next = node;
                head = head.next;
                l2 = l2.next;
            }
        if(carry > 0){
            ListNode node = new ListNode(carry);
            head.next = node;
        }
        return dummy.next;
    }
}