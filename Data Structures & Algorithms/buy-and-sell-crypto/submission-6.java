public class Solution{
    public int maxProfit(int[] prices){
        int Profit = 0;
        int MaxProfit = 0;
        //to sell, we select a day in the future.
        //Do it with 2 Pointers
        // [10,1,5,6,7,1]
        int LeftPointer = 0;
        int RightPointer = 1;
        while(RightPointer < prices.length){
            if(prices[RightPointer] > prices[LeftPointer]){
                int profit = prices[RightPointer] - prices[LeftPointer];
                MaxProfit = Math.max(profit, MaxProfit);
            } else{ //prices are same or future has a smaller selling price
                LeftPointer = RightPointer;
            }
            RightPointer++;
        }
        return MaxProfit;

        
    }
}