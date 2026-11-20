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
    public ListNode removeElements(ListNode head, int v) {
        ListNode temp = head;
        ListNode newHead = new ListNode(100);
        ListNode dummy = newHead;
        while(temp != null){
            if(temp.val != v){
                newHead.next = temp;
                newHead = newHead.next;
            }
            temp = temp.next;
        }
        newHead.next = null;
        return dummy.next;
    }
}