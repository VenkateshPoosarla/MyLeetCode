class Solution {
    public void setZeroes(int[][] matrix) {
        int x[]=new int[matrix.length];
        int y[]=new int[matrix[0].length];
        Arrays.fill(x,1);
        Arrays.fill(y,1);
        for(int i=0; i<x.length ; i++){
            for(int j=0; j<y.length ; j++){
             if(matrix[i][j]==0){
                 x[i]=0;
                 y[j]=0;
             }
            }
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
              if(x[i]==0 || y[j]==0){
                 matrix[i][j]=0; 
              }
            }
            }
        
    }
}