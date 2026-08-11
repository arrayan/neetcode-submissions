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
    public int maxDepth(TreeNode root) {
        //Iterative DFS with stack again.
        Stack<Pair<TreeNode,Integer>> stack = new Stack<>();
        if(root != null){
            stack.push(new Pair<>(root,1));
        }
        //initialise a return height
        int maxDepth = 0;
        while(!stack.isEmpty()){
            Pair<TreeNode,Integer> current = stack.pop(); //So we have sth like 1,1
            TreeNode currentNode = current.getKey();
            int height = current.getValue();
            if(currentNode.left != null){
                stack.push(new Pair<> (currentNode.left , height + 1));
            }
            if(currentNode.right != null){
                stack.push(new Pair<> (currentNode.right, height + 1));
            }
            maxDepth = Math.max(maxDepth, height);
        }
        return maxDepth;
}
}

