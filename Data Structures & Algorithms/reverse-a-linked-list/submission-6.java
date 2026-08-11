class Solution {
    public ListNode reverseList(ListNode head) {
        // 1. Base Case: If head is empty or only one node, it's already reversed.
        if (head == null || head.next == null) {
            return head;
        }

        // 2. Recursive Step: Reverse the REST of the list.
        // This will return the new head of the fully reversed sub-list.
        ListNode newHead = reverseList(head.next);

        // 3. The "Magic" Step:
        // Right now, 'head' is still connected to the next node (head.next).
        // But 'head.next' is effectively the TAIL of the reversed sub-list.
        // We need to make 'head.next' point back to 'head'.
        
        // YOUR CODE HERE (2 lines typically)
        // Hint: Use head.next to access the node that needs to point back to head.
        ListNode temp = head.next;
        head.next.next = head; 
        head.next = null;
        return newHead;
    }
}


