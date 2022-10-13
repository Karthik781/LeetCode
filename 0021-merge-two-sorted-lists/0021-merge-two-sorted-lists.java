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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node, cur= new ListNode(0);
        ListNode head = cur;
        while(null != list1 && null != list2){
            if(list1.val <= list2.val){
                node = new ListNode(list1.val);
             
                    cur.next = node;
                
                list1 = list1.next;
            }else{
                    node = new ListNode(list2.val);
                    cur.next = node;
                
                list2 = list2.next;
            }
         cur = cur.next;
        }
        while(null != list1){
            node = new ListNode(list1.val);
            cur.next = node;
            cur = cur.next;
                list1 = list1.next;
        }
         while(null != list2){
            node = new ListNode(list2.val);
            cur.next = node;
            cur = cur.next;
            list2 = list2.next;
        }
        return head.next;
    }
}