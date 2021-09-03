class Solution {
   
    public int maximizeSweetness(int[] sweetness, int K) {
        int sum=1000_000_000;///Arrays.stream(sweetness).sum()/(K+1);
        int left = 1, right = sum;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            int cuts=makeCutsWithMidOrHigh(sweetness,K,mid);
            if (cuts > K)
                left = mid;
            else
                right = mid - 1;
        }
        return right;
    }
    int makeCutsWithMidOrHigh(int[] sweetness,int K,int mid){
        int cur = 0, cuts = 0;
        for (int a : sweetness) {
                    if ((cur += a) >= mid) {
                        cur = 0;
                        if (++cuts > K) return cuts;
                    }
                }
        return cuts;
        
    }
}