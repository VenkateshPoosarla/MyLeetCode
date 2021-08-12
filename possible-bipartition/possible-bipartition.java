class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
      ArrayList<Integer> al[]=new ArrayList[n];
      for(int i=0;i<n;i++)
        al[i]=new ArrayList<>();
       for(int [] d:dislikes)
         {
             al[d[0]-1].add(d[1]-1);
             al[d[1]-1].add(d[0]-1);
         }
         int vcolor[]=new int[n];
         int color=-1;  
         int temp=1;
         Queue<Integer> qu=new LinkedList<>();
         for(int i=0;i<n;i++)
         {
             qu.offer(i);
             if(vcolor[i]!=0) continue;
         vcolor[i]=temp;  
         while(!qu.isEmpty()){
             int y=qu.poll();
             for(int x:al[y]){
                 if(vcolor[x]==vcolor[y]*color)
                     continue;
                 else if(vcolor[x]==0)
                 { vcolor[x]=vcolor[y]*color;
                   qu.offer(x);
                 }
                 else
                     return false;
             }
         }}
    return true;
    }
}