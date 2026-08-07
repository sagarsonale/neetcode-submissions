class Solution {
    public int maxProfit(int[] prices) {
        int right = prices.length;
        int left = 0;
        int profit = 0;
        for(int i = left; i < right ; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] < prices[j] && profit < (prices[j] - prices[i])){
                    
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
}

