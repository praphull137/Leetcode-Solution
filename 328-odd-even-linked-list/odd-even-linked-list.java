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
    public ListNode oddEvenList(ListNode head) {

if(head == null || head.next == null) return head;
        ListNode od = head;
        ListNode ev = head.next;
        ListNode evenHead = head.next;


        while(ev!= null && ev.next != null){
            od.next = od.next.next;
            ev.next = ev.next.next;
            od = od.next;
            ev = ev.next;
        }
        od.next = evenHead;
        return head;
    }
}