class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> L=new ArrayList<>();
        int num1=-1 , num2=-1 , cnt1=0 , cnt2=0 ;
        for(int i=0;i<nums.length;i++){
            if(num1==nums[i]){
                cnt1++;
            }else if(num2==nums[i]){
                cnt2++;
            }else if(cnt1==0){
                num1=nums[i];
                cnt1=1;
            }else if(cnt2==0){
                num2=nums[i];
                cnt2=1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                count1++;
            }else if(nums[i]==num2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            L.add(num1);
        }
        if(count2>nums.length/3){
            L.add(num2);
        }
        return L;
    }
}
