class Solution {
    public int maxProfit(int[] prices) {
       int l=0, r=1;
       int max_profit = 0;
       int temp_profit= 0;

       while(r<prices.length){
        if(prices[r]>prices[l]){
            temp_profit =  prices[r] - prices[l];
            if(temp_profit>max_profit){
                max_profit = temp_profit;
            }
        }else{
            l = r;
        }
        r += 1;
       }
       return max_profit;
    }
}
