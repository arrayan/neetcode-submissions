class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        NewMap_ = {}
        for i , n in enumerate(nums):
            diff = target - n
            if diff in NewMap_:
                return [NewMap_[diff], i]
            NewMap_[n] = i

        