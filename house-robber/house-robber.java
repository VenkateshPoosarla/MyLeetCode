class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        if(nums.length<3){
            if(nums.length==1)
                return nums[0];
            else
                return Math.max(nums[0],nums[1]);
        }
        dp[1]=nums[0];
        dp[2]=nums[1];
        int max=Math.max(nums[0],nums[1]);
        for(int i=3;i<dp.length;i++){
            dp[i]=Math.max(dp[i-2],dp[i-3])+nums[i-1];
            max=Math.max(dp[i],max);
        }
        return max;
        
    }
}