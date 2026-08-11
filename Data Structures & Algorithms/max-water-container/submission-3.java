class Solution {
    public int maxArea(int[] heights) {
        //[1,7,2,5,4,7,3,6]
        //twoPointer approach, minimum of the two values, and then multiple by the difference of l*r
        //Brute Force Approach
        int MaxArea = 0;
        int area = 0;
        int lengthOfHeight = heights.length ;
        for(int i = 0; i < lengthOfHeight - 1; i++){
            for(int j = i+1; j < lengthOfHeight; j++){
                area = Math.min(heights[j],heights[i]) * (j-i);
                MaxArea = Math.max(MaxArea,area);
            }
        }
        return MaxArea;
        
    }
}
