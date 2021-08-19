class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> H=new HashMap<>();
        int sum=0;
        H.put(sum,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(H.containsKey(sum-k)){
                count+=H.get(sum-k);
            }
            H.put(sum,H.getOrDefault(sum,0)+1);
        }return count;
    }
}
