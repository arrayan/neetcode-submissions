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
//Iterative DFS with Stack
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> myStack = new Stack<>();
        myStack.push(root);
        
        while(!(myStack.isEmpty())){
            TreeNode node = myStack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null){
                myStack.push(node.left);
            }
            if(node.right != null){
                myStack.push(node.right);
            } 
        }
        return root;
    }
}
