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
        ListNode temp = head;
        Set<ListNode> seen = new HashSet<>();
        while(temp != null){
            if(!(seen.contains(temp))){
                seen.add(temp);
                temp = temp.next;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
