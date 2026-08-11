public class Solution{
    public int maxProfit(int[] prices){
        int Profit = 0;
        int MaxProfit = 0;
        int MinPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            MinPrice = Math.min(prices[i], MinPrice);

            MaxProfit = Math.max(MaxProfit, prices[i] - MinPrice);
        }
        return MaxProfit;

        
    }
}