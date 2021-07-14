class Solution{
    public String findOrder(String [] dict,int N,int K){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++){
            adj.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<N-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int j=0;
            while(j<s1.length() && j<s2.length()){
                char c1=s1.charAt(j);
                char c2=s2.charAt(j);
                if(c1!=c2){
                    adj.get(c1-'a').add(c2-'a');
                    break;
                }j++;
            }
        }
        boolean vis[]=new boolean[K];
        String res="";
        for(int i=0;i<K;i++){
            if(!vis[i]){
                DFS(vis,i,adj,res);
            }
        }
        return res;
    }
    static void DFS(boolean[] vis,int src,ArrayList<ArrayList<Integer>> adj, 
    String res){
        vis[src]=true;
        for(int x: adj.get(src)){
            if(!vis[x]){
                DFS(vis,x,adj,res);
            }
        }
        char c=(char)(97+src);
        res=src+res;
    }
}
