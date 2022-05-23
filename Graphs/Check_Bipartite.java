class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int color[]=new int[V];
        for(int i=0;i<V;i++){
            if(color[i]==0){
                if(!IsBipartite(color,1,i,graph)){
                    return false;
                }
            }
        }return true;
    }
    public boolean IsBipartite(int color[], int col, int src, int[][] graph){
        color[src]=col;
        Queue<Integer> Q=new LinkedList<>();
        Q.add(src);
        while(!Q.isEmpty()){
            int u=Q.poll();
            int cl=color[u]==1?2:1;
            for(int v:graph[u]){
                if(color[v]==0){
                    color[v]=cl;
                    Q.add(v);
                }else if(color[v]!=0){
                    if(color[v]==color[u]){
                        return false;
                    }
                }
            }
        }return true;
    }
}
