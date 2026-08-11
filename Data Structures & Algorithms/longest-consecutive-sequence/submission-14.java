class Solution {
    public int longestConsecutive(int[] nums) {
        //Consecutive Sequence is defined if the diff bw eleemtns one after another is 1.
        // [2,20,4,10,3,4,5] -> [3,4,5] of length 3 and also [2,3,4,5]
        // So we just have to find pairs which differ by one.
        // Brute Force Solution would be: Keep checking pairs. Let's say, we have (2,20) -> increase 2nd index (2,3) -> Match; So
        //Store it somewhere; Since (2,3) is a match already; Check for things consecutive with (3), add it to the (2,3,4) list
        //E.g : [[0,3,2,5,4,6,1,1]] -> [0,1]
        //Wha is we sort it -> then it would be (n log n)
        //But in the pairs case how do we keep track of indices:
        //We start with 0.. (0,1) is a match; Then we do (3,4) is a match; (2), (5,6) , (4) , (6)
        //How to even do a O(n^2) Approach.
        //Start at a particular index: 
        //[2,20,4,10,3,4,5]
        //[2,3]
        // I dont even know honestly.
        //HashSet approach
        //Step 1: Populate: HashSet has 0. [] 
        //Populate all numbers into the hashSet
        Set<Integer> myHashSet = new HashSet<>();
        for(int i : nums){
            myHashSet.add(i);
        }
        int maxLength = 0;
        // we now have a populated HashSet
        // [0,3,2,5,4,6,1,1] -> [0,3,2,5,4,6,1]
        // Iterate through the HashSet

        if ((nums.length == 0) || (nums.length == 1)) {
            return nums.length;
        }

        for(int num : myHashSet){
            if(myHashSet.contains(num-1)){
                //Not the begining//
                //do nothing
            }
            else{
                int currentLength = 1; // we are at the start!
                while(myHashSet.contains(num+1)){ //We are at 1: check for 2
                    currentLength++;
                    num++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength ;
    }
}
