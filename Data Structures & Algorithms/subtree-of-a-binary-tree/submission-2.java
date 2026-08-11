class Solution {
    public boolean isSubtree(TreeNode p, TreeNode q) {
        //Check if it is the same Tree
        //Pass values like MainTrees different subtrees, and then q
        if(p == null){
            return (q == null);
        }

        if (isSameTree(p,q)){
            return true;
        }
        return (isSubtree(p.left,q)||isSubtree(p.right,q));
    }

    private static boolean isSameTree(TreeNode p , TreeNode q){
        if(p == null){
            return q==null;
        }
        if((p != null)&&(q != null)&&(p.val == q.val)){
            return (isSameTree(p.left,q.left)&& isSameTree(p.right,q.right));
        }
        return false;
    }
}
