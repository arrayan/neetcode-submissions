class Solution {
    public int[] twoSum(int[] nums, int target) {
        //fixate on a particular value
        //load all values to the hashMap?
        Map<Integer,Integer> myMap = new HashMap<>();
        int difference = 0;
        for(int i=0; i<nums.length;i++){
            difference = target - nums[i];
            if(myMap.containsKey(difference)){
                //
                return new int[]{myMap.get(difference),i};
            }
            else{
                myMap.put(nums[i],i);
            }
        }
        return new int[]{0,1};
        
        
    }
}
