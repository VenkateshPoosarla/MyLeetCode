class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        flipMatrix(matrix);
    }
    void transpose(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
        for(int j=i;j<matrix[i].length;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }}
    void flipMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
         int l=0;
         int r=matrix[i].length-1;
         while(l<r){
             int temp=matrix[i][l];
             matrix[i][l]=matrix[i][r];
             matrix[i][r]=temp;
             l++;
             r--;
         }   
        }
    }
}