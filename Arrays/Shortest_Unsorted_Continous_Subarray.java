/* O(nlogn) and O(n) */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int temp[]=nums.clone();
        Arrays.sort(temp);
        int start=nums.length, end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=temp[i]){
                start=Math.min(start,i);
                end=Math.max(end,i);
            }
        }
        return end-start>0?end-start+1:0;
    }
}

/* O(n) and O(1) */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                flag=true;
            }
            if(flag){
                min=Math.min(min,nums[i]);
            }
        }
        flag=false;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                flag=true;
            }
            if(flag){
                max=Math.max(max,nums[i]);
            }
        }
        int l, r;
        for(l=0;l<nums.length;l++){
            if(nums[l]>min){
                break;
            }
        }
        for(r=nums.length-1;r>=0;r--){
            if(nums[r]<max){
                break;
            }
        }
        return r-l<0?0:r-l+1;
    }
}
