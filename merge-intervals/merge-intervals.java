class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]==b[1]?b[0]-a[0]:b[1]-a[1]));
        List<int[]> li=new ArrayList<>();
        int merge[]=new int[2];
        merge=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(merge[0]<=intervals[i][1]){
                merge[0]=Math.min(intervals[i][0],merge[0]);
            }else{
                li.add(merge);
                merge=intervals[i];
            }
        }
        li.add(merge);
        int x[][]=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            x[i]=li.get(i);
        }
        return x;
    }
}