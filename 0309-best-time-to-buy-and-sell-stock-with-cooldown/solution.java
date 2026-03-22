class Solution {
    public int maxProfit(int[] prices) {
        boolean buying = true;
        //int max_profit = 0;
        int i=0;
        //if buy --> i+1
        //if sell --> i+1 //1 day cooldown is must

        //maintain a cache for dynamic programing
        HashMap<List<Object>, Integer> cacheMap = new HashMap<>();
 
        return dp(i,buying,prices,cacheMap);
    }

    public int dp(int i, boolean buying,int[] prices,HashMap<List<Object>, Integer> cacheMap){
            if(i>=prices.length){
                return 0;
            }
            List<Object> key = Arrays.asList(i,buying); //define key

            if(cacheMap.containsKey(key)){
                return cacheMap.get(key);
            }

            int ans = 0;
            if(buying){
                int buy_profit = dp(i+1, !buying, prices, cacheMap) - prices[i];
                int cooldown_profit = dp(i+1,buying, prices, cacheMap);
                ans = Math.max(buy_profit,cooldown_profit) ;
            }else{
                int sell_profit = dp(i+2, !buying, prices, cacheMap) + prices[i];
                int cooldown_profit = dp(i+1,buying, prices, cacheMap);
                ans = Math.max(sell_profit,cooldown_profit) ;
            }
            
            cacheMap.put(key,ans);
            return ans;
    }

}
