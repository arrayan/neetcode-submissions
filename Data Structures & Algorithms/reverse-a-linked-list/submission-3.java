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
    public ListNode reverseList(ListNode head) {
        //  nil -> [1] -> [2] -> [3] -> [4] -> nil //[2] -> [1] -> nil
        //  [1] <- [2] <- [3] <- [4]; 
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nxt = curr.next; //We do not want to nuke this link;;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
    }
}
