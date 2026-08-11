//package arrays;

class Solution {
    public boolean hasDuplicate(int[] nums){
        //Start with a HashMap, add elements if they exist as in if key is absent, if it is not absent, return false.
        //return true;
        Map<Integer,Integer> myHashMap = new HashMap<Integer,Integer>();
        for(int i:nums){
            if ((myHashMap.containsKey(i))) {
                return true; //Duplicate Exists
                //What's the point of i,i
            }
            else{
                myHashMap.put(i,1);
            }
        }
        return false;
    }
}
