class Solution {
    public int[] twoSum(int[] nums, int target) {
        int difference = 0 ;
        Map<Integer,Integer> tempMap = new HashMap<>();
        for (int i = 0 ; i < nums.length; i+=1){
            difference = target - nums[i];
            if(tempMap.containsKey(difference)){
                return new int[]{tempMap.get(difference) , i } ;
            }
            else{
                tempMap.put(nums[i] , i);
            }
        }
        return new int[]{-1,-1};
}
}

