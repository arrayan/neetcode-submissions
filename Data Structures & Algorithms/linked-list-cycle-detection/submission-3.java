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
    public boolean hasCycle(ListNode head) {
        //Cycle exists if atleas one node has been visited before
        HashSet<ListNode> mySet = new HashSet<>();
        ListNode dummy = head;
        ListNode tail = dummy;
        //Index is not a parameter but we still have to work with it.
        //Index 
        //Plan is keep going to null over and over. If we 

        while(tail != null){
            if(mySet.contains(tail)){
                return true;
            }
            //when we reach the end of the cycle; We get back to index.
            mySet.add(tail);
            tail = tail.next;
        }
        return false;
    }
}
