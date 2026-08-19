class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        my_dict = defaultdict(list)
        list_of_strings = strs
        for each_string in list_of_strings:
            key_ = ''.join(sorted(each_string))
            my_dict[key_].append(each_string)
        return list(my_dict.values())
