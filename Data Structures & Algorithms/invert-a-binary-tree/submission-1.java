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
    public TreeNode invertTree(TreeNode root) {
        //Handle base case
        if (root == null){
            return null;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        //Do this with the subtrees.
        invertTree(root.left);
        invertTree(root.right);

        //Temp would be lr; swap left and right.
        //pass invert with left and right.q
        return root;
    }

}
