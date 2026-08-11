class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> dcheck = new HashMap<>();

        for(int i : nums){
            if((dcheck.containsKey(i))){
                return true;
            }
            else{
                dcheck.put(i,i);
            }
        }
        return false;
    }
}
