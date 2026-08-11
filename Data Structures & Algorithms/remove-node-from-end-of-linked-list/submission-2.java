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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode firstPointer = dummy;
        ListNode secondPointer = dummy;
        while(n >= 0){
            //Init Second Pointer n places ahead of firstPointer.
            secondPointer = secondPointer.next;
            n--;
        }
        //secondPointer= secondPointer.next;
        while(firstPointer != null && secondPointer != null){
            firstPointer=firstPointer.next;
            secondPointer=secondPointer.next;
            //always secondPointer will reach null first. So when it reaches null, FirstPointer will be n positions away from the end.
        }
        //secondPointer is the thing which we need to remove.
        //Maybe we need to store the node just before the FP
        //[1x,2y,3yx,4xy->  ,5xy, ->6y,7x] -> We also know the length now. n = 3; i.e we have to remove 5 in this case. //
        //How can we track the element previous to this?
        // 4.next() = firstPointer.next();
        // Sever the link too: firstPointer.next() = null; Save it somewhere first before.
        firstPointer.next = firstPointer.next.next;
        return dummy.next;
    }
}
