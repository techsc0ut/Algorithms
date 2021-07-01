class Solution{
    static int min;
    public int minStepToReachTarget(int kni[],int tar[],int n){
        min=Integer.MAX_VALUE;
        Queue<temp> Q=new LinkedList<>();
        temp knix=new temp(kni[0]-1,kni[1]-1,0);
        boolean vis[][]=new boolean[n][n];
        Q.add(knix);
        vis[knix.i][knix.j]=true;
        while(!Q.isEmpty()){
            temp t=Q.remove();
            if(t.i==tar[0]-1 && t.j==tar[1]-1){
                min=Math.min(min,t.dist);
            }
            if(t.i-1>=0 && t.j+2<n && !vis[t.i-1][t.j+2]){
                temp y=new temp(t.i-1,t.j+2,t.dist+1);
                vis[t.i-1][t.j+2]=true;
                Q.add(y);
            }
            if(t.i-1>=0 && t.j-2>=0 && !vis[t.i-1][t.j-2]){
                temp y=new temp(t.i-1,t.j-2,t.dist+1);
                vis[t.i-1][t.j-2]=true;
                Q.add(y);
            }
            if(t.i+1<n && t.j-2>=0 && !vis[t.i+1][t.j-2]){
                temp y=new temp(t.i+1,t.j-2,t.dist+1);
                vis[t.i+1][t.j-2]=true;
                Q.add(y);
            }
            if(t.i+1<n && t.j+2<n && !vis[t.i+1][t.j+2]){
                temp y=new temp(t.i+1,t.j+2,t.dist+1);
                vis[t.i+1][t.j+2]=true;
                Q.add(y);
            }
            if(t.i+2<n && t.j-1>=0 && !vis[t.i+2][t.j-1]){
                temp y=new temp(t.i+2,t.j-1,t.dist+1);
                vis[t.i+2][t.j-1]=true;
                Q.add(y);
            }
            if(t.i+2<n && t.j+1<n && !vis[t.i+2][t.j+1]){
                temp y=new temp(t.i+2,t.j+1,t.dist+1);
                vis[t.i+2][t.j+1]=true;
                Q.add(y);
            }
            if(t.i-2>=0 && t.j-1>=0 && !vis[t.i-2][t.j-1]){
                temp y=new temp(t.i-2,t.j-1,t.dist+1);
                vis[t.i-2][t.j-1]=true;
                Q.add(y);
            }
            if(t.i-2>=0 && t.j+1<n && !vis[t.i-2][t.j+1]){
                temp y=new temp(t.i-2,t.j+1,t.dist+1);
                vis[t.i-2][t.j+1]=true;
                Q.add(y);
            }
        }
        return min;
    }
}
class temp{
    int i,j,dist;
    temp(int i,int j,int dist){
        this.i=i;
        this.j=j;
        this.dist=dist;
    }
}
