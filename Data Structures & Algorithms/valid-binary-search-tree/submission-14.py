# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def isValidTree(root, leftBound, rightBound):
            if root is None:
                return True
            if not (leftBound < root.val < rightBound):
                return False
            return isValidTree(root.left , leftBound, root.val) and isValidTree(root.right, root.val , rightBound)
        return isValidTree(root, float("-inf"),float("inf"))
    