class Solution {
    public int maxProfit(int[] prices) {
        //I do not honeslty know what sliding window even is:
        //Maybe we learn through this example!
        //prices = [10,1,5,6,7] : 6
        //We need to maxime difference between when we bought and when we sold!
        // diff = prices[index_2] - prices[index_1]; return Math.max(diff, currentPrice)
        //Sliding window sounds similiar to a 2Pointer.
        // [10,1,5,6,7] : 1 Pointer is at 10; 2nd is at 1; if 1 > 10: Would 

        int MaxPrice = 0;
        for(int leftPointer = 0; leftPointer < prices.length; leftPointer++){
            int currentProfit = 0;
            int rightPointer = leftPointer + 1;
            while((leftPointer < rightPointer) && (rightPointer < prices.length) && (leftPointer >= 0)){
                if(prices[rightPointer] > prices[leftPointer]){
                    currentProfit = prices[rightPointer] - prices[leftPointer];
                }
                MaxPrice = Math.max(currentProfit, MaxPrice);
                rightPointer++;
            }
        }
        return MaxPrice;
    }
}
