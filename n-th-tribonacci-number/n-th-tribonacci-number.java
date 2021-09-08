class Solution {
    public int tribonacci(int n) {
        int T0=0,T1=1,T2=1;
        if(n==0){
           return 0;
        }else if(n==1) return 1;
        else if(n==2) return 1;
        else{
            for(int i=3;i<n+1;i++){
                int temp=T0+T1+T2;
                T0=T1;
                T1=T2;
                T2=temp;
            }
            return T2;
        }
    }
}