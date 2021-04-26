// Given an array , rearrange to give the next permutation using the elements , if not then just sort them .
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return ;
        }
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                int a=nums[i-1];
                for(int j=nums.length-1;j>=i;j--){
                    if(nums[j]>a){
                        swap(nums,j,i-1);
                        break;
                    }
                }
                int as=i,b=nums.length-1;
                while(as<b){
                    int temp=nums[as];
                    nums[as]=nums[b];
                    nums[b]=temp;
                    as++;
                    b--;
                }
                return;   
            }
        }
        Arrays.sort(nums);
        return;
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
