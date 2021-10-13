class Solution {
    public int[] pourWater(int[] heights, int volume, int k) {
     int N = heights.length;
     int j = k;
     for(int i=0 ;i<volume;i++){
         while (j > 0 && heights[j] >= heights[j-1])
                j -= 1;
           while (j < N - 1 && heights[j] >= heights[j+1])
                j += 1 ;                 
            while( j > k && heights[j]== heights[j-1])
                j -= 1  ;     
            heights[j] += 1;
     }
            

        return heights   ;
    }
}