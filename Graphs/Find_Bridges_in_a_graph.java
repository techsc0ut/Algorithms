/* Finding bridges in a graph means, we have to find those edges which if removed will increase the number of components of a graph */
/* We will use tarjan's Algorithm here */

class Solution {
    static int time;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        time=0;
        ArrayList<ArrayList<Integer>> Adj=new ArrayList<>();
        List<List<Integer>> Res=new ArrayList<>();
        for(int i=0;i<n;i++){
            Adj.add(new ArrayList<>());
        }
        for(List<Integer> Lst:connections){
            int a=Lst.get(0);
            int b=Lst.get(1);
            Adj.get(a).add(b);
            Adj.get(b).add(a);
        }
        int par[]=new int[n]; // here par[i] represent the parent of ith node .
        int low[]=new int[n]; // here low[i] represents the lowest discovery time of the node accessible from ith node.
        int des[]=new int[n]; // here des[i] represents the discovery time of ith node.
        Arrays.fill(par,-1);
        Arrays.fill(low,-1);
        Arrays.fill(des,-1);
        for(int i=0;i<n;i++){
            if(des[i]==-1){
                DFS(i,des,low,par,Adj,Res);
            }
        }
        return Res;
    }
    public void DFS(int u, int des[], int low[], int par[], ArrayList<ArrayList<Integer>> Adj,  List<List<Integer>> Res){
        des[u]=time;
        low[u]=time;
        time+=1;
        for(int x:Adj.get(u)){
            if(des[x]==-1){ // If not visited
                par[x]=u;
                DFS(x,des,low,par,Adj,Res);
                low[u]=Math.min(low[x],low[u]);
                if(low[x]>des[u]){
                    List<Integer> L=new ArrayList<>();
                    L.add(u);L.add(x);
                    Res.add(L);
                }
            }
            else if(x!=par[u]){ // If already visited but not considering child to parent edge, also this will be a back edge.
                low[u]=Math.min(low[u],des[x]);
            }
        }
    }
}
