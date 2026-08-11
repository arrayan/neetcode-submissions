class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        desired_size = 2 * len(nums)
        ret_list = [None] * desired_size
        for i in range(0, len(nums)):
            ret_list[i] =  nums[i]
        for j in range(len(nums)-1, desired_size):
            ret_list[j] = nums[j - len(nums)]
        return ret_list


        