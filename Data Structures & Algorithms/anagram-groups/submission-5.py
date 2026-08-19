class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        default_dict_factory = defaultdict(list)
        for each_str in strs:
            key_ = ''.join(sorted(each_str))
            default_dict_factory[key_].append(each_str)
        return list(default_dict_factory.values())
            