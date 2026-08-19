class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = defaultdict(list)
        for each_str in strs :
            sorted_string = ''.join(sorted(each_str))
            d[sorted_string].append(each_str)
        return list(d.values())

        

        