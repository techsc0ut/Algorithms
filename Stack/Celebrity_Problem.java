class Solution{ 
    int celebrity(int M[][], int n){
        if(n==1){
            return 0;
        }
        Stack<Integer> S=new Stack<>();
        for(int i=0;i<n;i++){
            S.push(i);
        }
        while(S.size()>1){
            int a=S.pop();
            int b=S.pop();
            if(M[a][b]==1){
                S.push(b);
            }else{
                S.push(a);
            }
        }
        int x=S.pop();
        for(int i=0;i<n;i++){
            if(i!=x){
                if(M[i][x]==0 || M[x][i]==1){
                    return -1;
                }
            }
        }return x;
    }
}
