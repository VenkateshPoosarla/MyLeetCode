class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        ArrayList<Integer> []al=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            al[i]=new ArrayList<>();
        }
        for(int i=0;i<pre.length;i++){
           al[pre[i][0]].add(pre[i][1]);
        }
        int visited[]=new int[numCourses];
        int x[]=new int[1];
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==0){
                dfs(al,i,visited,x);
                if(x[0]==1) 
                    return false;
            }
        }
        return x[0]!=1;
    }
    void dfs(ArrayList<Integer> []al,int idx,int visited[],int x[]){
        if(visited[idx]==2)
            return;
        if(visited[idx]==1) {
            x[0]=1;
            return;
        }
        visited[idx]=1;
        for(int id:al[idx]){
          dfs(al,id,visited,x); 
        }
        visited[idx]=2;
    }
}