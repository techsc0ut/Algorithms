class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res=new ArrayList<>();
        if(heights==null || heights.length==0 || heights[0].length==0){
            return res;
        }
        int rows=heights.length;
        int cols=heights[0].length;
        boolean pacific[][]=new boolean[rows][cols];
        boolean atlantic[][]=new boolean[rows][cols];
        
        for(int i=0;i<cols;i++){
            DFS(0,i,-1,heights,pacific);
            DFS(rows-1,i,-1,heights,atlantic);
        }  
        for(int i=0;i<rows;i++){
            DFS(i,0,-1,heights,pacific);
            DFS(i,cols-1,-1,heights,atlantic);
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    static void DFS(int i,int j,int prev,int [][]heights,boolean[][] ocean){
        if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length){
            return;
        }
        if(heights[i][j]<prev || ocean[i][j]){
            return ;
        }
        ocean[i][j]=true;
        DFS(i+1,j,heights[i][j],heights,ocean);
        DFS(i-1,j,heights[i][j],heights,ocean);
        DFS(i,j+1,heights[i][j],heights,ocean);
        DFS(i,j-1,heights[i][j],heights,ocean);
    }
}
