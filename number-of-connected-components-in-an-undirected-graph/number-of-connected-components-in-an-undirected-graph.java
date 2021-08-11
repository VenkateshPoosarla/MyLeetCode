class Solution {
    
    public int countComponents(int n, int[][] edges) {
        ArrayList<Integer> al[]=new ArrayList[n];
         for(int i=0;i<n;i++){
             al[i]=new ArrayList<>();
         }
        for(int i=0;i<edges.length;i++){
            al[edges[i][1]].add(edges[i][0]);
            al[edges[i][0]].add(edges[i][1]);
        }
        boolean visited[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(al,visited,i);
                count++;
            }
        }
        return count;
    }
    void dfs(ArrayList<Integer> al[],boolean visited[],int idx){
        if(visited[idx]) return;
        visited[idx]=true;
        for(int x:al[idx]){
             dfs(al,visited,x);
        }
        
    }
}