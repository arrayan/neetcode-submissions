class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int n : nums) {
            myMap.put(n, myMap.getOrDefault(n, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(myMap.keySet());
        Collections.sort(keys, (a, b) -> myMap.get(b) - myMap.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        return result;
    }
}
