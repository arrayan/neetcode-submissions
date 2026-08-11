class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        HashMap_S = {}
        HashMap_D = {}
        #Create two Dictsm check if equal.
        for each_char in s:
            HashMap_S.update({each_char : HashMap_S.setdefault(each_char, 0)  + 1})
        for each_char in t:
            HashMap_D.update({each_char: HashMap_D.setdefault(each_char, 0) + 1})
        return HashMap_S == HashMap_D
        

        