class Solution {
    public int trap(int[] height) {
        //Set up a Max Left and Max Right Array
        int n = height.length;
        int[] MaxLeft = new int[n];
        int[] MaxRight = new int[n];

        //Populate them
        MaxLeft[0] = height[0];
        int CumulativeSum = 0;
        MaxRight[n-1] = height[n-1];
        for(int i = 1; i < n ;i++){
            MaxLeft[i] = Math.max(MaxLeft[i-1], height[i]);
        }
        for(int i = n - 2; i >= 0 ; i--){
            MaxRight[i] = Math.max(MaxRight[i+1], height[i]);
        }

        for(int i = 0; i < n; i++){
            int CurrentTrappedWater = Math.min(MaxLeft[i], MaxRight[i]) - height[i];
            if (CurrentTrappedWater > 0){
                CumulativeSum += CurrentTrappedWater;
            }
        }
        return CumulativeSum;
    }
}
