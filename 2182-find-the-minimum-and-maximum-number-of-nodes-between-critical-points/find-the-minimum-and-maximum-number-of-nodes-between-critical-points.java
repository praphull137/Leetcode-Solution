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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;
        if(c == null) return new int[]{-1,-1};
        int idx = 1, lidx = -1;
        int maxLen = -1, minLen = Integer.MAX_VALUE;
        int sidx = -1, fval = -1;

        while(c != null) {

            if((b.val < a.val && b.val < c.val) ||
               (b.val > a.val && b.val > c.val)) {

                if(fval == -1) {
                    fval = idx;
                }

                if(lidx != -1) {
                    sidx = lidx;
                    minLen = Math.min(minLen, idx - sidx);
                }

                lidx = idx;
            }

            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        if(fval == lidx) return new int[]{-1, -1};
        maxLen = lidx - fval;
        return new int[]{minLen, maxLen};
    }
}