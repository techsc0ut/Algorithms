/* Approach - 1 */
class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int median=n%2==0?(nums[n/2]+nums[(n-1)/2])/2:nums[n/2];
        int steps=0;
        for(int x:nums){
            steps+=Math.abs(median-x);
        }return steps;
    }
  
  
/* Approach - 2 */
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int steps=0;
        int i=0, j=nums.length-1;
        while(i<j){
            // nums[i] + x = nums[j]-y
            // => x+y = nums[j]-nums[i]
            steps+=Math.abs(nums[j--]-nums[i++]);
        }return steps;
    }
}
