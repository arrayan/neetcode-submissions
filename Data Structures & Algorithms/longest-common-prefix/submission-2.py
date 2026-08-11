class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        #[bat,bag,bank,band]
        #Vertical-Check method looks fine!
        #All prefix words will begin with the same elements
        j=0
        min_val = min(len(s) for s in strs) if strs else 0
        numberOfItems = len(strs)
        for i in range(numberOfItems-1):
            for j in range(0,min(len(strs[i]), len(strs[i+1]))):
                if(strs[i][j] != strs[i+1][j]):
                    min_val = min(j, min_val)
                    break
        
        return strs[0][:int(min_val)]
            #[bat,bag,bank,band]
            #[0,1,2,3]