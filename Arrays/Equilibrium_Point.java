class Solution {
    public static int equilibriumPoint(long arr[], int n){
        long sum=0 , left=0 , temp=0 ;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            left=temp;
            temp+=arr[i];
            sum-=arr[i];
            if(left==sum){
                return i+1;
            }
        }return -1;
    }
}
