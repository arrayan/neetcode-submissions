class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //We need a way to keep track the frequency of integers!
        //Use a HashMap and populate it
        Map<Integer,Integer> frequencyCount = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            frequencyCount.put(nums[i], frequencyCount.getOrDefault(nums[i],0)+1 );
        }
        //Now we have a populated HashMap
        // [1,2,2,3,3,3] -> (1,1) , (2,2) , (3,3)
        //Now we need to sort the HashMap
        List<Integer> keys = new ArrayList<>(frequencyCount.keySet());
        Collections.sort(keys, (a,b) -> frequencyCount.get(b) - frequencyCount.get(a));
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = keys.get(i);
        }
        return result;

    }
}
