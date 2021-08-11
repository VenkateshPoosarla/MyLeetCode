class Solution {
    public int numDecodings(String s) {
       int dp[]=new int[s.length()+1];
        if(s.charAt(0)=='0') return 0;
        dp[0]=1;
       for(int i=1;i<s.length()+1;i++){
           if(Integer.parseInt(s.substring(i-1,i))!=0){
               dp[i]=dp[i-1];
           }else{
               dp[i]=0;
           }
           if(i-2>=0 && Integer.parseInt(s.substring(i-2,i))>9 && 
              Integer.parseInt(s.substring(i-2,i))<=26){
           dp[i]+=dp[i-2];    
}
       }
        return dp[s.length()];
    }
    
        
}