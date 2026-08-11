class Solution {
    public int findMin(int[] nums) {
        //How do these rotations work???
        //if an array is rotated nums.length times it becomes the original array!
        //case1: [1,2,3,4,5,6]
        //In case the array is fully sorted
        int result = nums[0];
        int l=0;
        int r= nums.length - 1;

        while(l <= r){
            if(nums[l] < nums[r]){
                result = Math.min(result,nums[l]);
                break;
            } //The array was fully sorted, just return element at the first position
            int mid = (int)((l + r) / 2);
            result = Math.min(result, nums[mid]);
            if(nums[mid] >= nums[l]){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }

        }
        return result;
    }
}
