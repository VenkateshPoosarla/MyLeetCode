class Solution {
    public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
        // initialization
        int nC[][]=new int[3][colors.length];
        for(int j=0;j<3;j++){
            for(int i=0;i<colors.length;i++){
                if(colors[i]==j+1){
                   nC[j][i]=i; 
                }else{
                    if(i-1>=0)
                        nC[j][i]=nC[j][i-1];
                    else{
                        nC[j][i]=colors.length+1;
                    }
                }
            }
        }
         for(int j=0;j<3;j++){
              for(int i=colors.length-2;i>=0;i--){
                  
                  if(Math.abs(nC[j][i]-i)>Math.abs(nC[j][i+1]-i)){
                     nC[j][i]=nC[j][i+1];  
                  }
              }
         }
        List<Integer> li=new ArrayList<>();
        for(int []query:queries){
            int idx=query[0];
            int color=query[1];
            if(nC[color-1][idx]<colors.length)
                li.add(Math.abs(nC[color-1][idx]-idx));
            else
                li.add(-1);
        }
        return li;
    }
}