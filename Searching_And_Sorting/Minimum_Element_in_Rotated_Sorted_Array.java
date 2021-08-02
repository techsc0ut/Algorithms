class Solution{
    int findMin(int arr[], int n){
        if(arr[0]<=arr[n-1]){
            return arr[0];
        }
        return search(arr,0,n-1);   
    }
    int search(int ar[],int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(mid-1>=0 && ar[mid-1]>ar[mid]){
                return ar[mid];
            }
            else if(mid+1<=ar.length-1 && ar[mid]>ar[mid+1]){
                return ar[mid+1];
            }
            else if(ar[mid]>=ar[start]){
                start=mid+1;
            }else if(ar[mid]<=ar[end]){
                end=mid-1;
            }
        }return -1;
    }
}
