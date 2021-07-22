class Solution{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
        int color[]=new int[V];
        Arrays.fill(color,-1);
        boolean res=true;
        Queue<Integer> Q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                Q.add(i);
                color[i]=0;
                while(!Q.isEmpty()){
                    int u=Q.remove();
                    for(int x:adj.get(u)){
                        if(color[x]==-1){
                            color[x]=color[u] ^ 1;
                            Q.add(x);
                        }else{
                            res=res & (color[u]!=color[x]);           
                        }
                    }
                }
            }
        }return res;
    }
}
