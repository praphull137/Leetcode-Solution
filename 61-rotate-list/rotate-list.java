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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 ) return head;
        if(head == null) return null;
        if(head.next == null) return head;
        int count = 0;

        ListNode slow = head, fast = head, temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count == k || k % count == 0) return head;
        int len = k % count;
        
        for(int i =0; i<len+1; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        ListNode dummy = slow.next;
        slow.next = null;
        while(dummy.next != null) dummy = dummy.next;
        dummy.next = head;
        return newHead;


    }
}