class Solution {
    int median(int matrix[][], int r, int c) {
        int max=2000;
        int min=1;
        int desired=(1+r*c)/2;
        while(min<max){
            int mid=(min+max)/2;
            int places=0;
            int get=0;
            for(int i=0;i<r;i++){
                get=func(mid,i,matrix);
                if(get<0){
                    get=Math.abs(get)-1;
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
    static int func(int x, int r, int matrix[][]){
        int start=0;
        int end=matrix[0].length;
        while(start<end){
            int mid=(start+end)/2;
            if(matrix[r][mid]<=x){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}
