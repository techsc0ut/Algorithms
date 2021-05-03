class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int ar[], int a, int b){
       int low=0;
       int mid=0;
       int n=ar.length;
       int end=n-1;
       while(mid<=end){
           if(ar[mid]<a){
               swap(ar,low,mid);
               low++;
               mid++;
           }else if(ar[mid]>b){
               swap(ar,mid,end);
               end--;
           }else{
               mid++;
           }
       }
    }
    public void swap(int ar[],int a,int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
}
