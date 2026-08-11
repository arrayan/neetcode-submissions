class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        while(val in nums): #O(n)
            nums.remove(val) #O(n) Worst Case: O(n^2)
        return len(nums)
        