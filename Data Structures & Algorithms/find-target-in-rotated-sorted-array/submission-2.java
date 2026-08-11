class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int middle = l + (r - l) / 2;

            if (nums[middle] == target) {
                return middle; // Target found
            }

            if (nums[middle] >= nums[l]) { 
                // Left half is sorted
                if (target >= nums[l] && target < nums[middle]) {
                    r = middle - 1; // Search in left half
                } else {
                    l = middle + 1; // Search in right half
                }
            } else { 
                // Right half is sorted
                if (target > nums[middle] && target <= nums[r]) {
                    l = middle + 1; // Search in right half
                } else {
                    r = middle - 1; // Search in left half
                }
            }
        }
        return -1; // Target not found
    }
}
