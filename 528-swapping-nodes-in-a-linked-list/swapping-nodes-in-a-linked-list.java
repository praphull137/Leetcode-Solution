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
    public ListNode swapNodes(ListNode head, int n) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode temp = head;
        int count = 0;
        while(temp !=null){
            temp = temp.next;
            count++;
        }
        for(int i =1; i<n ;i++){
            temp1 = temp1.next;
        }
        int val1 = temp1.val;
        for(int i =1; i<=(count-n) ;i++){
            temp2 = temp2.next;
        }
        int val2 = temp2.val;
        temp1.val = val2;
        temp2.val = val1;
        return head;



    }
}