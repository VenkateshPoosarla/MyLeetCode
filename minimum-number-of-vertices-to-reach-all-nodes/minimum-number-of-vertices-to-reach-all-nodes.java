class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int x[]=new int[n];
        for(List<Integer> edge:edges){
            x[edge.get(1)]++;
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(x[i]==0) li.add(i);
        }
        return li;
    }
}