class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int f=-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                f=i+1;
                break;
            }
        }
        if(f==-1){
            int s=func(nums,target,0,n);
            if(s==-1){
                return -1;
            }else{
                return s;
            }
        }else{
            int p=func(nums,target,0,f);
            if(p!=-1){
                return p;
            }
            int diff=n-f;
            int q=func(nums,target,f,f+diff);
            if(q==-1){
                return -1;
            }
            return q;
        }
    }
    public static int func(int [] ar,int target,int start,int end){
        while(start<end){
            int mid=(start+end)/2;
            if(ar[mid]==target){
                return mid;
            }else if(ar[mid]>target){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
