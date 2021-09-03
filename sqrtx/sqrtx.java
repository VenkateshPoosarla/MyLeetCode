class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int left=1,right=x/2;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(mid==x/mid) return mid;
            else if(mid>x/mid){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return right;
    }
}