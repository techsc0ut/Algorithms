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
