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
//Iterative DFS Approach
class Solution {
    public TreeNode invertTree(TreeNode root) {
        //Handle base case
        //Initialise Stack
        //Push L and Right nodes appropritely.
        if(root == null){
            return null;
        }
        Stack<TreeNode> stack_ = new Stack<>();
        stack_.push(root);
        while(!(stack_.isEmpty())){
            TreeNode topMost = stack_.pop();
            TreeNode temp = topMost.right;
            topMost.right = topMost.left;
            topMost.left = temp;
            if(topMost.left != null){
                stack_.push(topMost.left);
            }
            if(topMost.right != null){
                stack_.push(topMost.right);
            }
        }
        return root;
    }
}
