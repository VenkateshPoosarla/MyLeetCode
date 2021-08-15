class Solution {
    class DJS{
        int rank[];
        int parent[];
        int count;
        public DJS(int n){
            count=n;
            rank=new int[n];
            parent=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                rank[i]=1;
            }
        }
        int find(int x){
            if(x==parent[x]){
                return x;
            }else{
                parent[x]=find(parent[x]);
                return  parent[x];
            }
        }
        boolean union(int x,int y){
            int rootx=find(x);
            int rooty=find(y);
            if(rootx==rooty)
                return false;
            if(rank[rootx]>rank[rooty]){
                parent[rootx]=rooty;
            }else if(rank[rootx]<rank[rooty]){
                parent[rooty]=rootx;
            }else{
                parent[rootx]=rooty;
                rank[rooty]+=1;
            }count--;
            return true;
        }
        boolean isConnected(int x,int y){
            return find(x)==find(y);
        }
        int getCount(){
            return count;
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        DJS djs=new DJS(n);
        for(int i=0;i<isConnected.length;i++){
             for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1){
                djs.union(i,j);
            }
             }
        }
        
        return djs.getCount();
    }
}