class Solution {
   
    public int maximizeSweetness(int[] sweetness, int K) {
        int left = 1, right = (int)1e9 / (K + 1);
        while (left < right) {
            int mid = (left + right + 1) / 2;
            
            int cuts=makeCutsWithMidOrHigh(sweetness,K,mid);
            if (cuts > K)
                left = mid;
            else
                right = mid - 1;
        }
        return left;
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