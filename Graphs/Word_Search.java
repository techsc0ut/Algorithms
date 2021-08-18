class Solution {
    public boolean exist(char[][] grid, String word) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==word.charAt(0) && DFS(0,grid,word,i,j)){
                    return true;
                }
            }
        }return false;
    }
    static boolean DFS(int count, char[][]grid, String word ,int i,int j){
        if(count==word.length()){
            return true;
        }
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=word.charAt(count)){
            return false;
        }
        char t=grid[i][j];
        grid[i][j]='*';
        boolean found=DFS(count+1,grid,word,i+1,j) || DFS(count+1,grid,word,i-1,j)
        || DFS(count+1,grid,word,i,j+1) || DFS(count+1,grid,word,i,j-1);
        grid[i][j]=t;
        return found;
    }
}
