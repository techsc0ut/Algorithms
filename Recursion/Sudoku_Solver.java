class Solution {
    public void solveSudoku(char[][] board) {
        char ar[][]=new char[board.length][board[0].length];
        func(0,0,board,ar);
        fill(board,ar);
        return;
    }
    static void fill(char ar[][],char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                ar[i][j]=board[i][j];
            }
        }
    }
    static void func(int i,int j,char[][] board,char ar[][]){
        if(i==board.length){
            fill(ar,board); 
            return ;
        }
        int ni=0 ,nj=0;
        if(j==board[0].length-1){
            ni=i+1;
            nj=0;
        }else{
            ni=i;
            nj=j+1;
        }
        if(board[i][j]!='.'){
            func(ni,nj,board,ar);
        }else{
            for(int po=1;po<=9;po++){
                char c=(char)(po+'0'); 
                if(isValid(i,j,c,board)){
                    board[i][j]=c;
                    func(ni,nj,board,ar);
                    board[i][j]='.';
                }
            }
        }
    }
    static boolean isValid(int i,int j,char c,char[][] board){
        for(int row=0;row<board.length;row++){
            if(board[row][j]==c){
                return false;
            }
        }
        for(int col=0;col<board[0].length;col++){
            if(board[i][col]==c){
                return false;
            }
        }
        int rr=i/3*3;
        int cc=j/3*3;
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                if(board[rr+a][cc+b]==c){
                    return false;
                }
            }
        }
        return true;
    }
}
