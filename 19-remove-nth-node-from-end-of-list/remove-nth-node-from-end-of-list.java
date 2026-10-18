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
        if(head.next == null ) return null;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if (n == len) {
    return head.next;
}
        temp = head;
        int endPoint = len - n;
        while(endPoint > 1){
            temp = temp.next;
            endPoint--;
        }
        temp.next = temp.next.next;
        return head;
    }
}