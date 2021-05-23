class Solution {
    public void merge(int arr1[], int arr2[], int n, int m) {
        int i=0,j=0,k=n-1;
        while(i<=k && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                int temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                k--;
                j++;
            }
        }
        mergeSort(arr1,0,arr1.length-1);
        mergeSort(arr2,0,arr2.length-1);
    }
    public void mergeSort(int ar[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(ar,start,mid);
            mergeSort(ar,mid+1,end);
            merge(ar,start,mid,end);
        }
    }
    public void merge(int ar[],int start,int mid,int end){
        int left[]=Arrays.copyOfRange(ar,start,mid+1);
        int right[]=Arrays.copyOfRange(ar,mid+1,end+1);
        int i=0,j=0;
        int index=start;
        int n=left.length;
        int m=right.length;
        while(i<n && j<m){
            if(left[i]>right[j]){
                ar[index++]=right[j++];
            }else{
                ar[index++]=left[i++];
            }
        }
        while(i<n){
            ar[index++]=left[i++];
        }
        while(j<m){
            ar[index++]=right[j++];
        }
    }
}
