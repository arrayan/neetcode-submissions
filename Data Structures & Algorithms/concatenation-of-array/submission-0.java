class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int SavedIndex = 0;
        for( int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            SavedIndex++;
        }
        for(int i = SavedIndex ; i < ans.length; i++){
            ans[i] = nums[i - nums.length];   
        }
        return ans;
    }
        
}