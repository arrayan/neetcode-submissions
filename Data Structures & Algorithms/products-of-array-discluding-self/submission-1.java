class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Prefix Suffix Approach
        int[] PreFixArray = new int[nums.length];
        int[] SuffixArray = new int[nums.length];
        //[1,2,4,6]
        //PA[] = [1,1,2,8]
        //SA[] = [48,24,6,1]
        //Populating the prefix array.
        //[1,2,4,6]; Length would be: 4
        int PrefixIdentity = 1;
        PreFixArray[0] = PrefixIdentity;
        for(int i = 1; i < nums.length; i++){
            PrefixIdentity *= nums[i-1]; //[[1,2,4,6] -> [1,1,2,8] //PI = [1,]
            PreFixArray[i] = PrefixIdentity;
        }
        //Suffix Array
        //Populating the suffix array begins from the opposite end.
        int SuffixIdentity = 1;
        SuffixArray[nums.length - 1] = 1;
        //[1,2,4,6] = [1,2,4,6](1)
        for(int j = nums.length - 2; j > -1; j--){
            SuffixIdentity *= nums[j+1];
            SuffixArray[j] = SuffixIdentity;
        }
        //Final-Loop
        int[] returnArray = new int[nums.length];
        for(int k=0; k < nums.length; k++){
            returnArray[k] = PreFixArray[k] * SuffixArray[k];
        }
        return returnArray;

    }
}  
