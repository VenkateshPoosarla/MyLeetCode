public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int x=0;
        for(int i=31;i>=0;i--){
            x+=(n&1)<<i;
            n=n>>1;
        }
       return x;
    }
}