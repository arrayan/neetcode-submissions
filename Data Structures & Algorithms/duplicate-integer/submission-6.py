class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        set_of_list = set(nums)
        if len(set_of_list) != len(nums):
            return True
        return False
        
        