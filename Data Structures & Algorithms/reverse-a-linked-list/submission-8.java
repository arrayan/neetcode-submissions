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
        //Iterative Approach Once again.
        // null -> [0] -> [1] -> [2] -> [3] -> null
        // null -> [3] -> [2] -> [1] -> [0] -> null
        // null <- [0] <- [1] <- [2] <- [3] <- null ;M // null <- [0] <- [1] :-->     [1] ->  [0] -> null
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;

    }
}
