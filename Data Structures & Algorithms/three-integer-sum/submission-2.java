class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Let's get started.
        // Return type is a list of List of Integers.
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sort the input array

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate values to avoid duplicate triplets
            }

            // Set up left and right pointers
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int target = nums[i] + nums[l] + nums[r];
                
                if (target < 0) {
                    l++;  // Move left pointer rightward to increase the sum
                } else if (target > 0) {
                    r--;  // Move right pointer leftward to decrease the sum
                } else {
                    // We found a valid triplet, add it to the result
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;  // Move left pointer to the right to look for new pairs

                    // Skip duplicate values for the left pointer
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;  // Move left pointer to the right to avoid duplicates
                    }
                }
            }
        }
        return res;  // Return the list of unique triplets
    }
}
