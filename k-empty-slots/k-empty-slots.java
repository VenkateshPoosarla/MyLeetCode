class Solution {
    public int kEmptySlots(int[] bulbs, int k) {
        int days[]=new int[bulbs.length+1];
        for(int i=0;i<bulbs.length;i++){
            days[bulbs[i]]=i+1;
        }
        int hi=k+2,lo=1;
        int result=bulbs.length+1;
        for(int i=1;hi<days.length;i++){
           
            if(days[lo]<days[i] && days[hi]<days[i]) continue;
             if(i==hi){
               result=Math.min(result,Math.max(days[hi],days[lo]));
            }
            lo=i;
            hi=lo+k+1;
        }
        return result==bulbs.length+1?-1:result;
    }
}