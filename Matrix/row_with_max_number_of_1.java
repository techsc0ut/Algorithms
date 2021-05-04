class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int i=0;
        int j=m-1;
        int index=-1;
        while(i<n && j>=0){
           if(arr[i][j]==1){
               index=i;
               j--;
           }else{
               i++;
           }
        }
        return index;
    }
}
