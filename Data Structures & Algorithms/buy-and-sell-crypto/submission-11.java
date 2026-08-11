class Solution {
    public int maxProfit(int[] prices) {
        //[10,1,5,6,7,1]
        //Start with Poiners intially at 10,1
        int leftPointer = 0;
        int RightPointer = 1;
        int PricesLength = prices.length;
        int MaxProfit = 0;

        while(RightPointer < PricesLength){
            if(prices[leftPointer] < prices[RightPointer]){
                int profit = prices[RightPointer] - prices[leftPointer];
                MaxProfit = Math.max(profit, MaxProfit);
            }
            else{
                leftPointer = RightPointer;
            }
            RightPointer++;
        }
        return MaxProfit;
}
}
