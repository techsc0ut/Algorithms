class Solution{
    static int x[]={-1,1,0,0,-1,1,-1,1};
    static int y[]={0,0,1,-1,1,1,-1,-1};
    public int[][] searchWord(char[][] grid, String word){
        ArrayList<int[]> A=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==word.charAt(0) && found(grid,i,j,word)){
                    int a[]={i,j};
                    A.add(a);
                }
            }
        }
        return A.toArray(new int[A.size()][]);
    }
    static boolean found(char grid[][],int i,int j,String word){
        int R=grid.length;
        int C=grid[0].length;
        int len=word.length();
        for(int dir=0;dir<8;dir++){
            int rd=i+x[dir];
            int cd=j+y[dir];
            int k;
            for(k=1;k<len;k++){
                if(rd<0 || rd>=R || cd<0 || cd>=C){
                    break;
                }
                if(grid[rd][cd]!=word.charAt(k)){
                    break;
                }
                rd+=x[dir];
                cd+=y[dir];
            }
            if(k==len){
                return true;
            }
        }
        return false;
    }
}
