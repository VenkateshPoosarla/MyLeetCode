class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int x[]=new int[2];
        x=intervals[0];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(x[1]<=intervals[i][0]){
                x=intervals[i];
            }else{
                count++;
            }
        }
        return count;
    }
}