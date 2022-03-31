class Solution{
    public static int findPages(int[]nums,int n,int m){
        if(m>n){
            return -1;
        }
        int lo=Integer.MIN_VALUE;
        int high=0;
        for(int x:nums){
            high+=x;
            lo=Math.max(lo,x);
        }
        int ans=-1;
        while(lo<=high){
            int mid=(lo+high)>>1;
            if(check(nums,mid,m)){
                high=mid-1;
                ans=mid;
            }else{
                lo=mid+1;
            }
        }return ans;
    }
    static boolean check(int nums[], int val, int m){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>val){
                sum=nums[i];
                count++;
            }
        }
        if(count<=m){
            return true;
        }return false;
    }
}
