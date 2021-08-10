class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(prices[i],buy);
            profit=Math.max(prices[i]-buy,profit);    
        }
        return profit;
    }
}