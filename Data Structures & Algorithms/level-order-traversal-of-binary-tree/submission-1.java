/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //We need to have an arrayList
        // How do we know we go down exactly one level?
        // I think we have to do something like a BFS
        // Question is how do we mantain level ordering?
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> returnList = new ArrayList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!(queue.isEmpty())){
            int lengthOfQueue = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < lengthOfQueue; i++){
                //we could use either poll
                TreeNode topMostNode = queue.poll();
                if (topMostNode != null) tempList.add(topMostNode.val);
                if (topMostNode.left != null){
                    queue.add(topMostNode.left);
                }
                if (topMostNode.right != null){
                    queue.add(topMostNode.right);
                }
            } //Top element is also removed from the queue
            //Queue contains all node of the current level.
            returnList.add(tempList);
        }
        return returnList;
    }
}
