class Solution {
                    // Up,   right,  down,    left
    int dir [][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    
    ArrayList<String> res;
    
    public ArrayList<String> findPath(int[][] m, int n) {
        
        res = new ArrayList<>();
        
        if(m[0][0] == 0) return res;
        
        boolean vis[][] = new boolean[n][n];
        
        vis[0][0] = true;
        
        helper(0, 0, "", m, vis, n);
        
        Collections.sort(res);
        
        return res;
        
    }
    
    public void helper(int i, int j, String curr, int[][] m, boolean vis[][], int n){
        
        if(i == n - 1 && j == n - 1) {
            
            res.add(curr);
            return;
            
        }
        
        for(int k = 0; k < dir.length; k++){
            
            int row = i + dir[k][0];
            
            int col = j + dir[k][1];
            
            if(row < n && row >= 0 && col < n && col >= 0 && m[row][col] != 0 && !vis[row][col]){
                
                vis[row][col] = true;
                
                if(k == 0){
                    
                    helper(row, col, curr+'U', m, vis, n);
                    
                }else if(k == 1){
                    
                    helper(row, col, curr+'R', m, vis, n);
                    
                }else if(k == 2){
                    
                    helper(row, col, curr+'D', m, vis, n);
                    
                }else{
                    
                    helper(row, col, curr+'L', m, vis, n);
                    
                }
                
                
                vis[row][col] = false;
                
            }
            
        }
        
    }
}
