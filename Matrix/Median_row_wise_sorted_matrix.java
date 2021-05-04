class Solution {
    int median(int m[][],int r,int c){
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<r;i++){
      if(m[i][0]<min){
        min=m[i][0]; 
      }
      if(m[i][c-1]>max){
        max=m[i][c-1];
      }
    }
    int desired=(1+r*c)/2;
    while(min<max){
      int mid=(min+max)/2;
      int places=0;
      int get=0;
      for(int i=0;i<r;i++){
        get=Arrays.binarySearch(m[i],mid);
        if(get<0){
          get=Math.abs(get)-1;
        }else{
          while(get<m[0].length && m[i][get]==mid){
            get+=1;
          }
        }
        places+=get;
      }
      if(places<desired){
        min=mid+1; 
      }else{
        max=mid;
      }
    }
    return min;
  }
}
