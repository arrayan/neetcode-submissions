class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Make a HashMap, if key already exists, return true.
        Map<Integer,Integer> myMap = new HashMap<>();
        for(int i: nums){
            if(!(myMap.containsKey(i))){
                myMap.put(i,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
