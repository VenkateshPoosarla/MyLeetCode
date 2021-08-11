class Solution {
    public String alienOrder(String[] words) {
        //intialise adjecency list
        ArrayList<Character> al[]=new ArrayList[26];
        boolean []cs=new boolean[26];
        for(int i=0;i<26;i++){
            al[i]=new ArrayList<>();
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char c1=words[i].charAt(j);
                cs[c1-'a']=true; 
            }
        }
        // buld graph with words
        
        for(int i=1;i<words.length;i++){
            for(int j=0;j<words[i-1].length();j++){
                char c1=words[i-1].charAt(j);
                if(j>=words[i].length()) return "";
                char c2=words[i].charAt(j);
                cs[c1-'a']=true;
                cs[c2-'a']=true;
                if(c1-c2!=0){
                    al[c1-'a'].add(c2); 
                    break;
                }
            }
        }
        
        // traverse the graph;
        int visited[]=new int[26];
        StringBuilder sb=new StringBuilder();
        int hasCycle[]=new int[1];
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0 && cs[i])
                dfs(al,i,visited,sb,hasCycle);
        }
        return hasCycle[0]==1?"":sb.reverse().toString();
    }
    void dfs(ArrayList<Character> al[], int idx, int visited[], StringBuilder sb, int[] hasCycle){
        if(visited[idx]==2){
            return;
        }
        if(visited[idx]==1){
            hasCycle[0]=1;
            return;
        }
        visited[idx]=1;
        for(char ch:al[idx]){
            dfs(al,ch-'a',visited,sb,hasCycle);
        }
         sb.append((char)(idx+'a'));
         visited[idx]=2;
    }
}