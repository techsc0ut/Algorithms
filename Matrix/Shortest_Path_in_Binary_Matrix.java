class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1){
            return -1;
        }
        int dir[][]={{0,1},{0,-1},{-1,0},{1,0},{-1,-1},{1,-1},{1,1},{-1,1}};
        Queue<int[]> Q=new LinkedList<>();
        Q.add(new int[]{0,0,1});
        grid[0][0]=1;
        while(!Q.isEmpty()){
            int size=Q.size();
            while(size-->0){
                int point[]=Q.poll();
                if(point[0]==grid.length-1 && point[1]==grid[0].length-1){
                    return point[2];
                }
                for(int i=0;i<dir.length;i++){
                    int r=point[0]+dir[i][0];
                    int c=point[1]+dir[i][1];
                    if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==0){
                        Q.offer(new int[]{r,c,point[2]+1});
                        grid[r][c]=1;
                    }
                }
            }
        }return -1;
    }
}
