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
    public ListNode reverse(ListNode h){
        ListNode f = null;
        ListNode p = null;
        ListNode c = h;

        while(c != null){
            f= c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow);
        ListNode temp = rev;
        slow= head;
        int sum = 0, maxSum = 0;

        while(temp!=null){
            sum = temp.val + slow.val;
            maxSum = Math.max(maxSum, sum);
            temp = temp.next;
            slow = slow.next;
        }
        return maxSum;

    }
}