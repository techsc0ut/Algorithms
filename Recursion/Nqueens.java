class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> Res=new ArrayList<>();
        char [][]chess=new char[n][n];
        for(char [] ar:chess){
            Arrays.fill(ar,'.');
        }
        func(chess,0,Res);
        return Res;
    }
    static void func(char [][]chess,int row,List<List<String>> Res){
        if(row==chess.length){
            put(chess,Res);
            return;
        }
        for(int i=0;i<chess.length;i++){
            if(isSafe(chess,row,i)){
                chess[row][i]='Q';
                func(chess,row+1,Res);
                chess[row][i]='.';
            }
        }
        
    }
    static void put(char [][]chess,List<List<String>> Res){
        ArrayList<String> Ar=new ArrayList<>();
        for(int i=0;i<chess.length;i++){
            String s="";
            for(int j=0;j<chess.length;j++){
                s+=chess[i][j];
            }
            Ar.add(s);
        }
        Res.add(Ar);
    }
    static boolean isSafe(char [][]chess,int row,int col){
        for(int i=row-1, j=col ;i>=0 ;i--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1 ,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
