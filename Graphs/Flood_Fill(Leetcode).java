class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int r=image.length;
        int c=image[0].length;
        int color=image[sr][sc];
        image[sr][sc]=newColor;
        boolean vis[][]=new boolean[r][c];
        Queue<int[]> Q=new LinkedList<>();
        Q.add(new int[]{sr,sc});
        while(!Q.isEmpty()){
            int cur[]=Q.remove();
            int i=cur[0],j=cur[1];
            if(i-1>=0 && image[i-1][j]==color && !vis[i-1][j]){
                vis[i-1][j]=true;
                image[i-1][j]=newColor;
                int t[]={i-1,j};
                Q.add(t);
            }
            if(j-1>=0 && image[i][j-1]==color && !vis[i][j-1]){
                vis[i][j-1]=true;
                image[i][j-1]=newColor;
                int t[]={i,j-1};
                Q.add(t);
            }
            if(j+1<c && image[i][j+1]==color && !vis[i][j+1]){
                vis[i][j+1]=true;
                image[i][j+1]=newColor;
                int t[]={i,j+1};
                Q.add(t);
            }
            if(i+1<r && image[i+1][j]==color && !vis[i+1][j]){
                vis[i+1][j]=true;
                image[i+1][j]=newColor;
                int t[]={i+1,j};
                Q.add(t);
            }
        }return image;
    }
}
