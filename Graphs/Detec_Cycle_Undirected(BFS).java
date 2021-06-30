class Solution{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<V;i++){
            if(!vis[i] && Detect_Cycle(V,i,adj,vis)){
                return true;
            }
        }return false;
    }
    static boolean Detect_Cycle(int V,int src,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        int parent[]=new int[V];
        Arrays.fill(parent,-1);
        Queue<Integer> Q=new LinkedList<>();
        Q.add(src);
        vis[src]=true;
        while(!Q.isEmpty()){
            int x=Q.remove();
            for(int i:adj.get(x)){
                if(parent[x]!=i){
                    if(vis[i]){
                        return true;
                    }
                    else if(!vis[i]){
                        parent[i]=x;
                        vis[i]=true;
                        Q.add(i);
                    }  
                }
            }
        }return false;
    }
}
