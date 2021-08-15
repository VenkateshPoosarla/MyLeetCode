class Solution {
    class Pair{
        int val;
        int row;
        int col;
        public Pair(int val,int row,int col){
            this.val=val;
            this.row=row;
            this.col=col;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
       for(int i=0;i<matrix[0].length;i++){
           pq.offer(new Pair(matrix[0][i],0,i));
       }
        Pair prev=new Pair(matrix[0][0],0,0) ;
       for(int i=0;i<k;i++) {
           prev=pq.poll();
           if(prev.row+1<matrix.length)
                pq.offer(new Pair(matrix[prev.row+1][prev.col],prev.row+1,prev.col));
             }
        return prev.val;
    }
}