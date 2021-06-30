class Solution{
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            vis[i]=false;
        }
        ArrayList<Integer> A=new ArrayList<>();
        Queue<Integer> Q=new LinkedList();
        Q.add(0);
        vis[0]=true;
        while(!Q.isEmpty()){
            Integer x=Q.remove();
            A.add(x);
            for(int y: adj.get(x)){
                if(!vis[y]){
                    Q.add(y);  
                    vis[y]=true;
                }
            }
        }
        return A;
    }
}
