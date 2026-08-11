class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Iterate, check if the elemtn is in the Hashmap, if not, add it, if so, then say true and exit-
        Set<Integer> mySet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if (!(mySet.contains(nums[i]))){
                mySet.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;

    }
}