class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        frequency_map = {}
        for n in nums:
            frequency_map[n] = frequency_map.get(n,0) + 1
        frequency_map_sorted = {k: v for k, v in sorted(frequency_map.items(), key=lambda item: item[1] , reverse = True)}
        list_ = list(frequency_map_sorted.keys())
        return list_[0]
         
        

        