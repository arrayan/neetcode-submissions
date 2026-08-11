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
    public void reorderList(ListNode head) {
        //Find MiddlePoint using Floyd's Detection algorithm
        //What takes place here? Actual Merging. I think we need another helper for that.
        mergeTwoLinkedLists(head , reverseLinkedList(findMiddlePoint(head)));
    }

    private static void mergeTwoLinkedLists(ListNode OriginalSubList_ , ListNode reversedList){
        // [0,1,2,3,4,5,6] -> [0,1,2,3] [4,5,6] -> [0  , 4, 1 ,5 , 2 ,6 , 3] 
        //tempNode 2 would contain the reversedList
        while(reversedList != null){
            ListNode tempvarA = OriginalSubList_.next;
            ListNode tempvarB = reversedList.next;

            OriginalSubList_.next = reversedList;
            reversedList.next = tempvarA;

            OriginalSubList_ = tempvarA;
            reversedList = tempvarB;
        }
    }


    private static ListNode reverseLinkedList(ListNode head){
        //2 Pointer approach again.
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            //reverse link and move ahead
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode reversedListHead = prev;

        return reversedListHead;
    }

    private static ListNode findMiddlePoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode splitPoint = slow.next;
        slow.next = null;
        return splitPoint; //[0,1y,2xy,3y,4x,5,6x] -> [0,1,2,3]  //splitPoint = [4,5,6] splitPoint is at 4.
    }
    //
}
