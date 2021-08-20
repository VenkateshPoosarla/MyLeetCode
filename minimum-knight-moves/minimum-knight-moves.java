class Solution {
    class Node{
        int x;
        int y;
        int level;
        public Node(int x,int y,int level){
            this.x=x;
            this.y=y;
            this.level=level;
        }
    }
    public int minKnightMoves(int x, int y) {
        int moves[][]=new int[][]{{1,2},{2,1},
                              {-2,1},{1,-2},
                              // {-1,-2},{-2,-1},
                              {-1,2},{2,-1}};
        y=Math.abs(y);
        x=Math.abs(x);
        Queue<Node> qu=new LinkedList<>();
        qu.add(new Node(0,0,0));
        Set<String> set=new HashSet<>();
        while(!qu.isEmpty()){
            Node node=qu.poll();
            for(int [] move:moves){
                 if(node.x==x && node.y==y) return node.level;
                int x1=node.x+move[0];
                int y1=node.y+move[1];
               
                int level=node.level+1;
                if(set.add(x1+"_"+y1)){
                    if(x1<5+Math.abs(x)+Math.abs(y)||y1<5+Math.abs(x)+Math.abs(y))
                        qu.add(new Node(x1,y1,level));
                }
            }
        }
        return -1;
    }
}