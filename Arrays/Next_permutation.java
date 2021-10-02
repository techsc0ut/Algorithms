// Given an array , rearrange to give the next permutation using the elements , if not then just sort them .
class Solution {
    public void nextPermutation(int[] nums) {
        int i=0, ind=-1;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            Arrays.sort(nums);
        }else{
            for(int j=nums.length-1;j>=0;j--){
                if(nums[ind]<nums[j]){
                    swap(nums,ind,j);
                    break;
                }
            }
            int a=ind+1;
            int b=nums.length-1;
            while(a<b){
                swap(nums,a,b);
                a++;
                b--;
            }  
        }
    }
    static void swap(int nums[],int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
