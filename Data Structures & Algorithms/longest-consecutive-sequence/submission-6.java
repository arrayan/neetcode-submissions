class Solution {
    public int longestConsecutive(int nums[]){
        //One Way of Solving: [2,20,4,10,3,4,5]
        // [2,3,4,4,5,10,20]
        //[9,1,4,7,3,-1,0,5,8,-1,6]
        //[-1,-1,0,1,3,4,5,6,7,8,9]
        if((nums.length == 1)||(nums.length == 0)){
            return nums.length;
        }
        Arrays.sort(nums);
        int ConsecutiveCount = 1;
        int MaxConsecutiveCount = 1;
        for(int i=1; i < nums.length; i++){
            
            if (nums[i] == 1 + nums[i-1]){
                ConsecutiveCount++;
            }
            else if(nums[i] != nums[i-1]){
                ConsecutiveCount = 1;
            }
            MaxConsecutiveCount = Math.max(MaxConsecutiveCount,ConsecutiveCount);
        }
        return MaxConsecutiveCount;
    }
}
