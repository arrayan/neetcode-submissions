class Solution {
    public int trap(int[] height) {
        //MaxLeft and MaxRight approach
        //Populate two arrays with max values
        int RightValArray[] = new int[height.length];
        int LeftValArray[] = new int[height.length];
        LeftValArray[0] = height[0] ; //Initial Values
        for(int i = 1 ; i < height.length; i++){
            LeftValArray[i] = Math.max(LeftValArray[i-1] , height[i]);
        }
        RightValArray[height.length - 1] = height[height.length - 1];
        //Do the same for RightValArray
        for(int i = height.length - 2 ; i >= 0; i--){
            RightValArray[i] = Math.max(RightValArray[i+1] , height[i]);
        }

        int cummulativeSum = 0;
        for(int i = 0 ; i < height.length - 1; i++){
            if(Math.min(RightValArray[i] , LeftValArray[i]) - height[i] >= 0) {
                cummulativeSum += Math.min(RightValArray[i] , LeftValArray[i]) - height[i];
            }
        }
        return cummulativeSum;

    }
}