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
        //Comparisons approach:
        //[[1,2,4],[1,3,5],[3,6]] we have something which points to the head of all three lists.
        // [1,3]
        // []
        //Goofball cases: Handle afterwards
        PriorityQueue<ListNode> MinHeap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode listnode_ : lists){
            if(listnode_ != null){
                MinHeap.add(listnode_); //Just the heads are added
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode returnListNode = dummy;

        //Heap is populated
        while(!(MinHeap.isEmpty())){
        ListNode smallest = MinHeap.poll(); //We have now the current as the 
        returnListNode.next = smallest;
        returnListNode = returnListNode.next;
        if(smallest.next != null){
            MinHeap.add(smallest.next);
        }
    }
    return dummy.next;
}
}

