class Solution {
    public int makeConnected(int n, int[][] con) {
        int edges=con.length;
        if(edges<n-1){
            return -1;
        }
        ArrayList<ArrayList<Integer>> A=new ArrayList<>();
        for(int i=0;i<n;i++){
            A.add(new ArrayList<Integer>());
        }
        for(int i=0;i<con.length;i++){
            A.get(con[i][0]).add(con[i][1]);
            A.get(con[i][1]).add(con[i][0]);
        }int count_components=0;boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count_components++;
                DFS(A,vis,i);
            }
        }return count_components-1;
    }
    static void DFS(ArrayList<ArrayList<Integer>> A,boolean vis[],int src){
        vis[src]=true;
        for(int x:A.get(src)){
            if(!vis[x]){
                DFS(A,vis,x);
            }
        }
    }
}
