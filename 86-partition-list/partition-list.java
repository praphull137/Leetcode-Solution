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
    public ListNode partition(ListNode head, int x) {
        ListNode h1 = new ListNode(100);
        ListNode temp1 = h1;
        ListNode h2 = new ListNode(100);
        ListNode temp2 = h2;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                temp1.next = temp;
                temp1 = temp1.next;
            }else{
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp2.next = null;
        temp1.next = null;
        temp1.next = h2.next;
        return h1.next;
        // temp2.next = null;
        // temp1.next = h2.next;
        // return h1.next;
    }
}