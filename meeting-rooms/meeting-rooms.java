class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
        if(intervals.length<2) return true;
        int start[]=intervals[0];
      for(int i=1;i<intervals.length;i++)  {
          if(start[1]>intervals[i][0])
              return false;
           start=intervals[i];
      }
        return true;
    }
}