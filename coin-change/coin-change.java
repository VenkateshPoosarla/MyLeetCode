class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<dp.length;j++){
                if(j-coins[i]>=0)
                {dp[j]=Math.min(dp[j-coins[i]]+1,dp[j]);}
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}