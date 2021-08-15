class Solution {
    List<List<Integer>> li=new ArrayList<>();
    int target;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> l1=new ArrayList<>();
        this.target=graph.length-1;
        l1.add(0);
        allPaths(0,graph,l1);
        return li;
    }
    void allPaths(int current,int[][] graph,List<Integer> l1){
        if(current==this.target){
            li.add(new ArrayList<Integer>(l1));
            return;
        }
        for(int node:graph[current]){
            l1.add(node);
            allPaths(node,graph,l1);
            l1.remove(l1.size()-1);
        }
    }
}