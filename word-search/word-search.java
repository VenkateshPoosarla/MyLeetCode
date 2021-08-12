class Solution {
    public boolean exist(char[][] board, String word) {
        boolean [][]seen;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                seen=new boolean[board.length][board[0].length];
                if(exists(board,i,j,0,word,seen)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean exists(char[][] board,int r,int c,int idx,String word,boolean[][] seen){
        if(idx==word.length()) 
           return true;
        if(r==-1 ||r==board.length||c==-1 ||c==board[0].length||seen[r][c])
           return false;
        
        if(board[r][c]==word.charAt(idx)){
            
            seen[r][c]=true;
        boolean out=exists(board,r+1,c,  idx+1,word,seen) ||
                 exists(board,r,  c+1,idx+1,word,seen) ||
                 exists(board,r-1,c,  idx+1,word,seen) ||
                 exists(board,r,  c-1,idx+1,word,seen) ;
            seen[r][c]=false;
            return out;
          }else{
              return false;
          }
           
    }
    
}