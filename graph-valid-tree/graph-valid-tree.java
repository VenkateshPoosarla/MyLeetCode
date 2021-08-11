class Solution {
    class Node{
        int data;
        Node parent;
        int rank;
    }
    class DJS{
                Map<Integer,Node> map=new HashMap<>();
                public void makeSet(int data){
                    Node n=new Node();
                    n.data=data;
                    n.rank=0;
                    n.parent=n;
                    map.put(data,n);    
                }
            public boolean union(int d1,int d2){
                Node n1=map.get(d1);
                Node n2=map.get(d2);
                
                Node p1=findSet(n1);
                Node p2=findSet(n2);
                if(p1==p2)
                    return false;
                if(p1.rank>=p2.rank){
                    p1.rank=(p2.rank==p1.rank)?p1.rank+1:p1.rank;
                    p2.parent=p1;
                }else{
                    p1.parent=p2;
                }
                return true;
            }
            public int findSet(int data){
                return findSet(map.get(data)).data;
            }
            
         public Node findSet(Node n){
             if(n.parent==n){
                 return n;
             }
             n.parent=findSet(n.parent);
             return n.parent;
         }
            }
    public boolean validTree(int n, int[][] edges) {
        DJS djs=new DJS();
        for(int i=0;i<n;i++){
            djs.makeSet(i);
        }
        for(int i=0;i<edges.length;i++){
            int x[]=edges[i];
            if(!djs.union(x[0],x[1]))
            {
                return false;
            }
        }
        int parent=djs.findSet(0);
        for(int i=1;i<n;i++)
        {
            if(parent!=djs.findSet(i)){
                return false;
            }
        }
        return true;
    }
}