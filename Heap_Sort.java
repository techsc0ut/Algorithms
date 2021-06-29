class Solution{
    void buildHeap(int arr[], int n){
        int pv=n/2-1;
        for(int i=pv;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    void heapify(int arr[],int n,int i){
        int max=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[max]<arr[l]){
            max=l;
        }
        if(r<n && arr[max]<arr[r]){
            max=r;
        }
        if(max!=i){
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            heapify(arr,n,max);
        }
    }
    public void heapSort(int arr[],int n){
        buildHeap(arr,n);
        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,i,0);
        }
    }
 }
 
 
