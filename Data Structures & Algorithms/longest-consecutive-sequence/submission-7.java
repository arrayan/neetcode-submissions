class Solution {
    public int longestConsecutive(int[] nums){
        //How do?
        Set<Integer> myHashSet = new HashSet<>();
        int longest = 0;
        for(int i : nums){
            myHashSet.add(i);
        }
        for(int num : myHashSet){
            if(!(myHashSet.contains(num-1))){
                int length = 1;
                while(myHashSet.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest,length); 
            }
        }
        return longest;

    }
}
