class Solution{
    static int trappingWater(int arr[], int n) { 
        int [] left=new int[n];
        int [] right=new int[n];
        int buff=0;
        for(int i=0;i<n;i++){
            buff=Math.max(buff,arr[i]);
            left[i]=buff;
        }
        buff=0;
        for(int j=n-1;j>=0;j--){
            buff=Math.max(buff,arr[j]);
            right[j]=buff;
        }
        buff=0;
        int total_count=0;
        for(int k=0;k<n;k++){
            buff=Math.min(left[k],right[k]);
            total_count+=Math.max(0,buff-arr[k]);
        }
        return total_count;
    } 
}
