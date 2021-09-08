class Solution {
    public int fib(int n) {
        int n0=0;
        int n1=1;
        if(n<2) return n;
        for(int i=2;i<n+1;i++){
            int temp=n0+n1;
            n0=n1;
            n1=temp;
        }
        return n1;
    }
}