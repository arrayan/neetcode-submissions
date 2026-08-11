class Solution {
    public int maxArea(int[] heights) {
        //We need to keep track of 2 bars.
        // LeftIndex, RightIndex
        // Area = Math.min(height of 2 indices) * 
        //[1,7,2,5,4,7,3,6] -> LI = 1; RI = 7 ; RI - LI * Math.min(height of 2 Indices)
        //currentMaxHeight calculated this way and then keep updating it via maxHeight = math.max(currentMaxHeight,maxHeight);
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        int MaxArea = 0;
        // [1,7,2,5,4,7,3,6] -> // [7,]
        while(leftIndex < rightIndex){
            //
            int currentArea = Math.min(heights[leftIndex],heights[rightIndex]) * (rightIndex - leftIndex);
            MaxArea = Math.max(currentArea, MaxArea);
            if ((heights[leftIndex] < heights[rightIndex])){
                leftIndex++;
            }
            else if((heights[rightIndex] <= heights[leftIndex])){
                rightIndex--;
            }
        }
        return MaxArea;
    }
}
