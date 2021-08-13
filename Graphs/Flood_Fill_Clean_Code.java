class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean vis[][]=new boolean[image.length][image[0].length];
        int prev=image[sr][sc];
        Fill(prev,sr,sc,vis,newColor,image);
        image[sr][sc]=newColor;
        return image;
    }
    static void Fill(int prev,int i,int j,boolean vis[][],int newColor,int image[][]){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length ||
          image[i][j]!=prev || vis[i][j]){
            return;
        }
        prev=image[i][j];
        image[i][j]=newColor;
        vis[i][j]=true;
        Fill(prev,i-1,j,vis,newColor,image);
        Fill(prev,i+1,j,vis,newColor,image);
        Fill(prev,i,j-1,vis,newColor,image);
        Fill(prev,i,j+1,vis,newColor,image);
    }
}
