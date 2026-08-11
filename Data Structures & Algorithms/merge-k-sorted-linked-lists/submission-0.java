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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> myList = new ArrayList<>();
        for(ListNode node:lists){
            while(node != null){
                myList.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(myList);


        //Reconstruct List
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int newnodes : myList){
            current.next = new ListNode(newnodes);
            current = current.next;
        }
        return dummy.next;
    }
}
