class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        sys.setrecursionlimit(10000)
        #We need a n-log-n algorithm. What can we use:
        #I think a binary sort should suffice.
        # We are QuickSortMaxxing.
        if len(nums) < 2:
            return nums # 0 or 1 Element list is already sorted.
        pivot_element = nums[0]
        bigger = [i for i in nums[1:] if i >= pivot_element]
        smaller = [i for i in nums[1:] if i < pivot_element]
        return self.sortArray(smaller) + [pivot_element] + self.sortArray(bigger)
                
        