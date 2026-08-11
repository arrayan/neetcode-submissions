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
        //Idea is: height would be height of subtree + 1;
        //math.max(hLeftSubtree, heightRightSubtree);
        if(root == null){
            return 0;
        }
        TreeNode leftSubNode = root.left;
        TreeNode rightSubNode = root.right;
        return Math.max(maxDepth(leftSubNode)+1, maxDepth(rightSubNode)+1);
        
    }
}

