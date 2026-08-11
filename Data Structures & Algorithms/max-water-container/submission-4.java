class Solution {
    public int maxArea(int[] heights) {
        //TwoPointer Approach
        int leftPointer = 0;
        int rightPointer = heights.length-1;
        int MaxArea = 0;
        int Area = 0;
        while(leftPointer < rightPointer){
            //
            Area = (rightPointer - leftPointer) * Math.min(heights[leftPointer], heights[rightPointer]);
            MaxArea = Math.max(MaxArea,Area);

            if(heights[rightPointer] >= heights[leftPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return MaxArea;
    }
}
