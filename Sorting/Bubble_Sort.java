/* Best Case : Occurs when array is already sorted , and time complexity becomes o(n) */
/* Worst Case : Occurs when array is reverse sorted , and time complexity becomes o(n^2) 
   Also , Average case complexity is also O(n^2) , and Space complexity: O(1) because inplace Algorithm */

class Solution{
	public static void bubbleSort(int arr[], int n){
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    static void swap(int ar[],int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
