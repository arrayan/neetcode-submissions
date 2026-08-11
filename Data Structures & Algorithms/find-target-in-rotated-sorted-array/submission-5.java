class Solution {
    public int search(int[] nums, int target) {
        // [3,4,5,6,1,2] // [[1,2,3,4,5,6]] // [5,6,1,2,3,4] -> MP is lesser than our LP; RightHalf is sorted
        // LP = 0; RP = 5;
        // MID = 2; i.e 5
        // if MP == target {return target}
        // MP > target and MP > RP; //That means, we need to look in the right half. ; LP = mid + 1;
        // MP > RP ; target > MP; //rightHalf
        // MP <  RP -> Atleast from MP to RP there is ordering;
        // 4 items with which we could make comparisons: MP;LP;RP;target
        int leftPointer =  0;
        int rightPointer = nums.length - 1;
        while(leftPointer <= rightPointer){
            int midPoint = leftPointer + (rightPointer - leftPointer) / 2;
            if(nums[midPoint] == target ){
                return midPoint;
            }
            // LP <= MidPoint ; else RightSide is sorted!
            // [3,4,5,1,2] -> LP = 3; RP = 2; MP = 5; TwoHalves -> LP to MP  and MP to RP -> FirstHalf is sorted. Does target belong here; as in is it within this range.
            //If yes; look in the left half; otherwise look in the right
            if (nums[leftPointer] <= nums[midPoint]){
                //LeftHalf is sorted!
                //check if our: target is within the range:
                // The bounds of this are between: LP and MP
                if ((target <= nums[midPoint]) && (target >= nums[leftPointer])){
                    //Look in this half
                    //set pointer values to such.
                    rightPointer = midPoint - 1;
                }
                else{
                    leftPointer = midPoint + 1;
                }
            }
            else{
                //rightHalf is sorted
                //check if we are within range in the right half!
                if((target > nums[midPoint]) && (target <= nums[rightPointer])){
                    leftPointer = midPoint + 1;
                }
                else{
                    rightPointer = midPoint - 1;
                }
            }
        }
        return -1;
    }
}
