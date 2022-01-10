class Solution {
    public int maxProfit(int[] arr) {
        int buy=0, sell=0, prof=0, n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                sell++;
            }else{
                prof+=arr[sell]-arr[buy];
                buy=i;
                sell=i;
            }
        }
        prof+=arr[sell]-arr[buy];
        return prof;
    }
}
