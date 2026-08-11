class Solution {
    public int search(int[] nums, int target) {
        int lowerPointer = 0;
        int higherPointer = nums.length - 1;
        while(lowerPointer <= higherPointer){
            int mid = ((lowerPointer + higherPointer) / 2);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                higherPointer = mid - 1;
            }
            else{
                lowerPointer = mid + 1;
            }
        }
        return -1;
    }
}
