class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int zeroCount = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }
        

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    result[i] = product;
                } else {
                    result[i] = 0;
                }
            } else {
                result[i] = product / nums[i];
            }
        }
        
        return result;
    }
}
