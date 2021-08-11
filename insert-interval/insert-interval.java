class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
        List<int[]> li=new ArrayList<>();
        boolean added=false;
        for(int []x:intervals){
             if(x[1]<ni[0]){
                        li.add(x);
                    }
            else if(x[0]>ni[1]){
                if(!added){
                    li.add(ni);
                    added=true;
                }
                li.add(x);    
            }else{
                ni[0]=Math.min(ni[0],x[0]);
                ni[1]=Math.max(ni[1],x[1]);
                
            }
        }
        if(!added){
                    li.add(ni);
                    added=true;
                }
        int y[][]=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            y[i]=li.get(i);
        }
        return y;
        
    }
}