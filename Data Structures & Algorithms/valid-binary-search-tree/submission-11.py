# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def isValid(root, leftVal, rightVal):
            if root is None:
                return True
            if not(root.val > leftVal and root.val < rightVal ):
                return False
            return isValid(root.left, leftVal , root.val) and isValid(root.right, root.val , rightVal)
        return isValid(root, float("-inf") , float("inf"))