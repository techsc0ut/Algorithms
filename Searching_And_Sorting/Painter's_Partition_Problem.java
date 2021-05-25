class Solution{
    static boolean IsPossible(int ar[],long mid,int k){
        long sum=0;
        int st=1;
        int n=ar.length;
        for(int i=0;i<n;i++){
            if(ar[i]>mid){
                return false;
            }
            if(sum+ar[i]>mid){
                st++;
                sum=ar[i];
                if(st>k){
                    return false;
                }
            }else{
                sum+=ar[i];
            }
        }
        return true;
    }
    static long minTime(int[] arr,int n,int k){
        long start=0;
        long sum=0;
        for(int i:arr){
            sum+=i;
        }
        long end=sum;
        long ans=Long.MAX_VALUE;
        while(start<=end){
            long mid=(start+end)/2;
            if(IsPossible(arr,mid,k)){
                ans=Math.min(ans,mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
