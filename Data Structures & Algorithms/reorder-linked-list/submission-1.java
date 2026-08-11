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
    public void reorderList(ListNode head){
        if(head == null){
            return;
        }
        //Approach is the following: Use an ArrayList, where we store all values of the LinkedList and then we change the nodes etc. in the linkedLIst itself
        List<ListNode> myList = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            myList.add(current);
            current = current.next;
        }

        //Begin with the 2-Pointer Approach

        int l = 0;
        int r = myList.size() - 1; //last Element
        while(l < r){
            myList.get(l++).next = myList.get(r);
            if(l >= r){
                break;
            }
            myList.get(r--).next = myList.get(l);
        }
        myList.get(l).next = null;
    }
}
