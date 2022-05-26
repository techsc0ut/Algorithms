// Kahn's Algorithm for Topological Sorting, Possible for only Directed Acyclic Graphs .
class Solution{ 
    static int[] topoSort(int V,ArrayList<ArrayList<Integer>> adj){
        int Top[]=new int[V];
        int indeg[]=new int[V];
        for(int i=0;i<adj.size();i++){
            for(int x:adj.get(i)){
                indeg[x]++;
            }
        }
        Queue<Integer> Q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                Q.add(i);
            }
        }int ind=0;
        while(!Q.isEmpty()){
            int x=Q.remove();
            Top[ind++]=x;
            for(int i:adj.get(x)){
                indeg[i]--;
                if(indeg[i]==0){
                    Q.add(i);
                }
            }
        }return Top;
        
    }
}
