class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        size_to_exceed = math.floor( len(nums) // 2)
        for n in nums:
            if nums.count(n) >= size_to_exceed:
                return n
        return -1
        