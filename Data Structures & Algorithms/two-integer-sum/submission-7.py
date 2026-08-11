class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ''' [1,3,5,8] : 11



        '''
        hash_map = {}
        for i,n in enumerate(nums): 
            difference = target - n
            if difference in hash_map:
                return [hash_map[difference] , i]
            hash_map[n] = i 