class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> A=new ArrayList<>();
        if(m[0][0]!=0){
            int vis[][]=new int[n][n];
            func(n,A,"",0,0,m,vis);
        }return A;
    }
    static void func(int n,ArrayList<String> A, String s,int i,int j,int[][]m,int [][]vis){
        if(i==n-1 && j==n-1){
            A.add(s);
            return;
        }
        if(i+1<n && vis[i+1][j]==0 && m[i+1][j]==1){
            vis[i][j]=1;
            func(n,A,s+"D",i+1,j,m,vis);
            vis[i][j]=0;
        }
        if(j-1>=0 && vis[i][j-1]==0 && m[i][j-1]==1){
            vis[i][j]=1;
            func(n,A,s+"L",i,j-1,m,vis);
            vis[i][j]=0;
        }
        if(j+1<n && vis[i][j+1]==0 && m[i][j+1]==1){
            vis[i][j]=1;
            func(n,A,s+"R",i,j+1,m,vis);
            vis[i][j]=0;
        }
        if(i-1>=0 && vis[i-1][j]==0 && m[i-1][j]==1){
            vis[i][j]=1;
            func(n,A,s+"U",i-1,j,m,vis);
            vis[i][j]=0;
        }
    }
}
