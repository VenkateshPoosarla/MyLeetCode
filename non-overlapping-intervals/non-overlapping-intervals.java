class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]==b[1]?a[0]-b[0]:a[1]-b[1]));
        int[] start=intervals[0];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<start[1]){
                count++;
            }else{
                start=intervals[i];
            }
            
        }
        return count;
    }
}