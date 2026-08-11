class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        //[-1,0,1,2,-1,-4] ->[-4, -1, -1, 0, 1, 2]
        for(int i = 0; i < nums.length - 1; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //Setting up 2 Pointers
            //LeftPointer; RigthPointer
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            int target = -nums[i];
            while(leftPointer < rightPointer){
                int sum = nums[leftPointer] + nums[rightPointer];
                if(sum < target){
                    //increment the LP
                    leftPointer++;
                }
                if(sum > target){
                    rightPointer--;
                }
                if(sum == target){
                    ans.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                    while ((nums[leftPointer] == nums[leftPointer + 1]) && leftPointer < rightPointer && leftPointer < nums.length - 2){
                        leftPointer++;
                    }
                    while ((nums[rightPointer] == nums[rightPointer-1]) && leftPointer < rightPointer){
                        rightPointer--;    
                    }
                    leftPointer++;
                    rightPointer--;
            }
        }
    }
    return ans;
}
}
