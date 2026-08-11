class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> storage = new HashMap<>();
        //Bruteforce Solution.
        //Start populating; check if it doesnt exsit, If it already exists; return true that it contains a duplicate
        for(int i=0; i < nums.length ; i++) {
            if (!(storage.containsKey(nums[i]))) {
                storage.put(nums[i] , i); 
            }
            else{
                return true;
            }
        }
        return false;


    }
}