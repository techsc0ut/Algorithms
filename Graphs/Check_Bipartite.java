class Solution {
    int color[];
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int V=graph.length;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int x:graph[i]){
                adj.get(i).add(x);
            }
        }
        color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){                      // This loop will take care if their are more than one components of graph .
            if(color[i]==-1){
                if(!IsBipartite(i,1,adj)){
                    return false;
                }
            }
        }return true;
    }
    public boolean IsBipartite(int src, int col, ArrayList<ArrayList<Integer>> adj){
        color[src]=col;
        Queue<Integer> Q=new LinkedList<>();
        Q.offer(src);
        while(!Q.isEmpty()){
            int curr=Q.poll();
            int co=1-color[curr];
            for(int x:adj.get(curr)){
                if(color[x]!=-1){
                    if(color[curr]==color[x]){
                        return false;
                    }
                }else{
                    color[x]=co;
                    Q.offer(x);
                }
            }
        }return true;
    }
}
