class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        leftPointer = 0
        rightPointer = len(nums)
        '''
        [2,3,4]
        if curr element is val:
            What do we do then?
        '''
        while(val in nums):
            nums.remove(val)
        
        return len(nums)
        