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
        //Initialise stack with pair storing: TreeNode and a height
        // As long as node!=null, means it has either no children, or left or right etc.
        Stack<Pair<TreeNode,Integer>> stack = new Stack<>();
        if (root != null) stack.push(new Pair<>(root,1));
        int res = 0;

        while(!stack.isEmpty()){
            Pair<TreeNode,Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int depth = current.getValue();

            if(node != null){
                res = Math.max(res, depth);
                stack.push(new Pair<>(node.left , depth + 1));
                stack.push(new Pair<>(node.right , depth + 1));
            }
        }
        return res;
    }
}
