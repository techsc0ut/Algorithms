class Solution{
    public boolean isCycle(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++){
            if(!vis[i] && DFS(i,-1,adj,vis)){
                 return true;
            }
        }return false;
    }
    static boolean DFS(int src,int parent,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[src]=true;
        for(int i:adj.get(src)){
            if(i!=parent){
                if(vis[i]){
                    return true;
                }
                if(!vis[i] && DFS(i,src,adj,vis)){
                    return true;
                }
            }
        }return false;
    }
}
