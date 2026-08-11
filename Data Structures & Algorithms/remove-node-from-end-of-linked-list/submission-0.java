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
        ListNode current = head;
        List<ListNode> mymap = new ArrayList<>();
        while(current != null){
            mymap.add(current);
            current=current.next;
        }
        //[1,2,3,4,5,6,7,8], n = 3
        //ArrayList is Populated.
        int indexFromFront = mymap.size() - n;
        if(indexFromFront == 0){
            return head.next;
        }
        mymap.get(indexFromFront-1).next = mymap.get(indexFromFront).next;
        return head;
}
}
