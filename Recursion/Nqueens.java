class Solution {
    char [][] board;
    List<List<String>> ans;
    int n;
    Set<Integer> col=new HashSet(), posDiag=new HashSet(), negDiag=new HashSet();
    public List<List<String>> solveNQueens(int N) {
        n=N;
        board=new char[n][n];
        ans=new ArrayList<>();
        for(char[] x:board){
            Arrays.fill(x,'.');
        }func(0);
        return ans;
    }
    public void func(int r){
        if(r==n){
           List<String> res = new LinkedList<String>();
            for(int i = 0; i < board.length; i++) {
                String s = new String(board[i]);
                res.add(s);
            }
            ans.add(res);
            return;
        }
        for(int c=0;c<n;c++){
            if(col.contains(c) || posDiag.contains(r+c) || negDiag.contains(r-c)){
                continue;
            }
            col.add(c);
            posDiag.add(r+c);
            negDiag.add(r-c);
            board[r][c]='Q';
            func(r+1);
            // Below is the backtracking part
            board[r][c]='.';
            col.remove(c);
            posDiag.remove(r+c);
            negDiag.remove(r-c);
        }
    }
}
