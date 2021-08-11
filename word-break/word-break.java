class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        Set<String> set=new HashSet<>(wordDict);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if(dp[i]&&set.contains(str)){
                    dp[j]=true;
                }
            }
        }
        return dp[s.length()];
    }
}