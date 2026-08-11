class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash_map = {} #init empty dict.
        for num in nums:
            if hash_map.get(num):
                return True
            else:
                hash_map.update({num:1})
        return False
        