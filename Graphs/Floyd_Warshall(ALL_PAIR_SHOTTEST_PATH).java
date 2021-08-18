for(int k=0;k<n;k++){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j){
               matrix[i][j]=0;
            }else if(i==k || j==k){
               continue;
            }else if(matrix[i][k] < INF && matrix[k][j] < INF && matrix[i][k] + matrix[k][j] < INF){
               matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);   
            }
        }
    }
}
