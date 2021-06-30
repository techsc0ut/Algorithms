class Solution{
    public ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        ArrayList<Integer> A=new ArrayList<>();
        DFS(vis,A,adj,0);
        return A;
    }
    static void DFS(boolean vis[],ArrayList<Integer> A,ArrayList<ArrayList<Integer>> adj,int r){
        vis[r]=true;
        A.add(r);
        for(int y: adj.get(r)){
            if(!vis[y]){
                vis[y]=true;
                DFS(vis,A,adj,y);
            }
        }
    }
}
