class Solution{
    int time;
    int cnt;
    Stack<Integer> st;
    ArrayList<ArrayList<Integer>> Res;
    public ArrayList<ArrayList<Integer>> tarjans(int V, ArrayList<ArrayList<Integer>> adj) {
        Res=new ArrayList<>();
        time=0;
        cnt=0;
        st=new Stack();
        int des[]=new int[V], low[]=new int[V];
        boolean IsPresent[]=new boolean[V];
        Arrays.fill(des,-1);Arrays.fill(low,-1);
        for(int i=0;i<V;i++){
            if(des[i]==-1){
                DFS(i,des,low,IsPresent,adj);
            }
        }
        Collections.sort(Res, (l1, l2) -> l1.get(0).compareTo(l2.get(0)));
        return Res;
    }
     public void DFS(int u, int des[], int low[], boolean IsPresent[], ArrayList<ArrayList<Integer>> adj){
        des[u]=time;
        low[u]=time;
        time++;
        st.push(u);
        IsPresent[u]=true;
        for(int v:adj.get(u)){
            if(des[v]==-1){
                DFS(v,des,low,IsPresent,adj);
                low[u]=Math.min(low[u],low[v]);
            }else if(IsPresent[v]){ // if present then a back edge
                low[u]=Math.min(low[u],des[v]);
            }
        }
        if(low[u]==des[u]){
            ArrayList<Integer> Lst=new ArrayList<>();
            while(st.peek()!=u){
                IsPresent[st.peek()]=false;
                Lst.add(st.pop());
            }
            IsPresent[u]=false;
            Lst.add(st.pop());
            Collections.sort(Lst);
            Res.add(Lst);
        }
    }
}
