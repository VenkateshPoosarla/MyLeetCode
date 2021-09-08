class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rsize=matrix.length;
        int colsize=matrix[0].length;
        int start=0;
        int end=rsize*colsize-1;
        while(start<=end){
            int pivot=(start+end)/2;
            int midval=matrix[pivot/colsize][pivot%colsize];
            if(midval==target)
                return true;
            else{
                if(midval>target){
                    end=pivot-1;
                }else{
                    start=pivot+1;
                }
            }
        }
        return false;
        
        
    }
}