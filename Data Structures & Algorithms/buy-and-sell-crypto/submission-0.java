public class Solution{
    public int maxProfit(int[] prices){
        int Profit = 0;
        int MaxProfit = 0;
        //to sell, we select a day in the future.
        for(int i = 0; i < prices.length-1; i++){
            for(int j=i+1; j < prices.length; j++){
                if(prices[j] > prices[i]){
                    //sell it
                    Profit = prices[j] - prices[i];
                    MaxProfit = Math.max(MaxProfit,Profit);
                }
            }
        }
        return MaxProfit;
    }
}