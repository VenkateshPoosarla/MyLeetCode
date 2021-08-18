class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> al[]=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            al[i]=new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int x[]=prerequisites[i];
            al[x[1]].add(x[0]);
        }
        boolean hascycle[]=new boolean[1];
        int visited[]=new int[numCourses];
        for(int i=0;i<al.length;i++){
            if(visited[i]!=2){
                dfs(visited,al,i,hascycle);
            }
            if(hascycle[0])
                return false;
        }
            return true;
    }
    
    void dfs(int visited[],ArrayList<Integer> al[],int idx,boolean hascycle[]){
        if(visited[idx]==2)
            return;
        if(visited[idx]==1)
        {
            hascycle[0]=true;
            return;
        }
        visited[idx]=1;
        for(int x:al[idx]){
            dfs(visited,al,x,hascycle);
        }
        visited[idx]=2;
    }
}