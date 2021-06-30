class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        boolean stack[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i] && DFS(adj,i,stack,vis)){
                return true;
            }
        }return false;
    }
    static boolean DFS (ArrayList<ArrayList<Integer>> adj,int r,boolean stack[],boolean []vis){
       stack[r]=true;
       vis[r]=true;
       for(int i:adj.get(r)){
           if(!vis[i] && DFS(adj,i,stack,vis)){
               return true;
           }if(stack[i]){
               return true;
           }
       }
       stack[r]=false;
       return false;
    }
}
