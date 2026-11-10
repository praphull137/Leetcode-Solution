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
    ListNode rev(ListNode head){
        ListNode head1 = head;
        if(head1 == null || head1.next == null) return head1;
        ListNode newHead = rev(head1.next);
        head1.next.next = head1;
        head1.next = null;
        return newHead;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode revs = rev(slow);
        fast = head;
        int sum = 0, max = 0;
        while(revs != null){
            sum = fast.val + revs.val;
            max = Math.max(max, sum);
            fast = fast.next;
            revs = revs.next;
        }
        return max;
    }
}