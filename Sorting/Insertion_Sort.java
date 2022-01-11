/* Best Time Complexity is O(n) , occurs when array is pre-sorted 
   whereas the Average and Worst case time complexity is O(n^2) */
class Solution{
    public void insertionSort(int arr[], int n){
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
