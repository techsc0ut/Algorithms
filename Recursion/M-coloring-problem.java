class solve {
    
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
        int col [] = new int[n];
        
        Arrays.fill(col, -1);
        
        return helper(0, col, m, n, graph);
    
    }
    
    public boolean isValid(int node, int color, int n, boolean[][] graph, int[] col){
        
        for(int i = 0; i < n; i++){
            
            if(graph[node][i]){
                
                if(col[i] == color) return false;
                
            }
            
        }
        
        return true;
        
    }
    
    public boolean helper(int node, int col[], int m, int n, boolean[][] graph){
        
        if(node == n) return true;
        
        for(int color = 0; color < m; color++){
            
            if(isValid(node, color, n, graph, col)){
                
                col[node] = color;
                
                if(helper(node + 1, col, m, n, graph)) return true;
                
                col[node] = -1;
            }
            
        }
        
        return false;
        
    }
}
