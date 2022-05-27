class Solution{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        int dis[]=new int[V];
        for(int i=0;i<V;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        Set<Integer> St=new HashSet<>();
        PriorityQueue<Vertex> PQ=new PriorityQueue<>();
        dis[S]=0;
        PQ.add(new Vertex(S,0));
        while(!PQ.isEmpty()){
            Vertex curr=PQ.poll();
            if(!St.contains(curr.val)){
                St.add(curr.val);
                ArrayList<ArrayList<Integer>> neighbors=adj.get(curr.val);
                for(ArrayList<Integer> Edge:neighbors){
                    int val=Edge.get(0);
                    int wt=Edge.get(1);
                    if(!St.contains(val)){
                        if(dis[val]>dis[curr.val]+wt){
                            dis[val]=dis[curr.val]+wt;
                            PQ.add(new Vertex(val,dis[val]));
                        }    
                    }
                }
            }
        }
        return dis;
    }
}
class Vertex implements Comparable<Vertex>{
    int val;
    int wt;
    Vertex(int _val, int _wt){
        this.val=_val;
        this.wt=_wt;
    }
    public int compareTo(Vertex e){
        return this.wt-e.wt;
    }
}

