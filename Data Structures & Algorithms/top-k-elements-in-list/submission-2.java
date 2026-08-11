class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int n : nums) {
            myMap.put(n, myMap.getOrDefault(n, 0) + 1);
        }
        //We can also solve it with the help of a prioroity queu
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> myMap.get(a) - myMap.get(b)
        );
        //List<Integer> keys = new ArrayList<>(myMap.keySet());
        //Collections.sort(keys, (a, b) -> myMap.get(b) - myMap.get(a));
        //Now fill the queue
        for(int num : myMap.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}
