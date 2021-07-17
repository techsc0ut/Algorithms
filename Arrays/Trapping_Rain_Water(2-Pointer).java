class Solution{
    static int trappingWater(int arr[], int n) {
        int lmax = arr[0], rmax = arr[n-1] ;
        int low = 0, high = n-1 ;
        int result = 0;
        while(low<high){
            if(arr[low]<arr[high]){
                if(arr[low]>lmax){
                    lmax=arr[low];
                }else{
                    result+=(lmax-arr[low]);
                }
                low++;
            }else{
                if(arr[high]>rmax){
                    rmax=arr[high];
                }else{
                    result+=(rmax-arr[high]);
                }
                high--;
            }
        }return result;
    } 
}

