class Solution {
    public int maxProfit(int[] prices) {
        //
        int maxPrice = 0;
        int l = 0;
        int r = 1;
        while(r < prices.length){
            if(prices[r] > prices[l]){
                //Window is valid!
                int difference = prices[r] - prices[l];
                maxPrice = Math.max(difference, maxPrice);
            }
            else{
                l = r;
            }
            r++;
        }
        return maxPrice;
    }
}
