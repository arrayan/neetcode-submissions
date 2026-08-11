# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    #Brute force Bozo Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        entries = []
        def dfs(root : TreeNode):
            if root is None:
                return None
            dfs(root.left)
            entries.append(root.val)
            dfs(root.right)
        
        dfs(root)
        return entries[k-1]