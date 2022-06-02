class Solution{
    static int[] parent;
    static int[] rank;
    static int find(int a){
        if(parent[a]==a){
            return a; 
        }return parent[a]=find(parent[a]);
    }
    static void union(int a, int b){
        int x=find(a);
        int y=find(b);
        if(rank[x]>rank[y]){
            parent[y]=x;
            rank[x]++;
        }else if(rank[x]<rank[y]){
            parent[x]=y;
            rank[y]++;
        }else{
            parent[x]=y;
            rank[y]++;
        }
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        parent=new int[V];
        rank=new int[V];
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
        PriorityQueue<Edge> All=new PriorityQueue<>();
        for(int i=0;i<V;i++){
            for(ArrayList<Integer> A:adj.get(i)){
                All.offer(new Edge(i,A.get(0),A.get(1)));
            }
        }
        int cost=0;
        while(!All.isEmpty()){
            Edge curr=All.poll();
            int a=find(curr.s);
            int b=find(curr.d);
            if(a!=b){
                cost+=curr.wt;
                union(a,b);
            }
        }return cost;
    }
}
class Edge implements Comparable<Edge>{
    int s;
    int d;
    int wt;
    Edge(int _s, int _d, int _wt){
        this.s=_s;
        this.d=_d;
        this.wt=_wt;
    }
    public int compareTo(Edge e){
        return this.wt-e.wt;
    }
}
