class Solution {
    public int majorityElement(int[] nums) {
        int num=-1 , cnt=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                num=nums[i];
            }
            if(num==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        return num;
    }
}
