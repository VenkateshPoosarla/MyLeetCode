class Solution {
    public int[] countBits(int n) {
        int offset=1;
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<ans.length;i++){
            if(offset*2==i)
                offset=offset*2;
            ans[i]=ans[i-offset]+1;
        }
        return ans;
    }
}