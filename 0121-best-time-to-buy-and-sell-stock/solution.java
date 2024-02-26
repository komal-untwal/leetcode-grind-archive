class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int final_profit = 0;
        int profit_today= 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            profit_today = prices[i] - min;
            if(profit_today > final_profit){
                final_profit = profit_today;
            }
        }
            return final_profit;
    }
}
