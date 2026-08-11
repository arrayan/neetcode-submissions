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
        ListNode next = null;
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            next = current.next;
            // Store next node
            current.next = prev;  // Reverse the link
            prev = current;       // Move prev forward
            current = next;       // Move current forward
        }
        head = prev;
        return head;
    }
}
