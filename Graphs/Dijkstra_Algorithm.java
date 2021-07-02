class Solution{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj,int S){
        int dist[]=new int[V];
        initialize(dist,V);
        Set<Integer> St=new HashSet<>();
        PriorityQueue<vertex> P=new PriorityQueue<vertex>();
        dist[S]=0;
        P.add(new vertex(S,0));
        while(!P.isEmpty()){
            vertex x=P.remove();
            if(!St.contains(x.val)){
                St.add(x.val);
                relaxation(x,adj,P,St,dist);
            }
        }return dist;
    }
    static void relaxation(vertex x,ArrayList<ArrayList<ArrayList<Integer>>> adj,
    PriorityQueue<vertex> P, Set<Integer> S,int dist[]){
        ArrayList<ArrayList<Integer>> A=adj.get(x.val);
        for(int i=0;i<A.size();i++){
            int v=A.get(i).get(0);
            int wt=A.get(i).get(1);
            if(!S.contains(v)){
                if(dist[v]>dist[x.val]+wt){
                    dist[v]=dist[x.val]+wt;
                } 
                P.add(new vertex(v,dist[v]));
            }
        }
    }
    static void initialize(int dist[],int V){
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
    }
}
class vertex implements Comparable<vertex>{
    int val;
    int cost;
    vertex(int _val,int _cost){
        this.cost=_cost;
        this.val=_val;
    }
    @Override
    public int compareTo(vertex V){
        return this.cost-V.cost;
    }
}

