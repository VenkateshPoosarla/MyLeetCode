class Solution {
    public int climbStairs(int n) {
        int s1=1;
        int s2=2;
        if(n<3) return n;
        int result=s2;
        for(int i=3;i<n+1;i++){
            result=s1+s2;
            s1=s2;
            s2=result;
        }
        return result;
    }
}