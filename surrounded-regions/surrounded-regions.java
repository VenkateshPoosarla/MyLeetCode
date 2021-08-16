class Solution {
    public void solve(char[][] board) {
       //going over the boarder vaibales for renaming
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O')
              markOs(board,i,0);
            if(board[i][board[0].length-1]=='O')
              markOs(board,i,board[0].length-1) ;
        }
        for(int i=0;i<board[0].length;i++){
             if(board[0][i]=='O')
              markOs(board,0,i);
            if(board[board.length-1][i]=='O')
              markOs(board,board.length-1,i); 
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if (board[i][j]=='T')
                    board[i][j]='O';
                else
                    board[i][j]='X';
            }}
    }
    void markOs(char[][] board,int x,int y){
        if(x==-1||y==-1||x==board.length||y==board[0].length||board[x][y]=='X'||board[x][y]=='T'){
            return;
        }
        board[x][y]='T';
        markOs(board,x+1,y);
        markOs(board,x-1,y);
        markOs(board,x,y+1);
        markOs(board,x,y-1);
    }
}