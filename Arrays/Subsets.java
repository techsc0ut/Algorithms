class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int limit=(int)Math.pow(2,nums.length); // For n numbers, their would be 2^n subsets possible .
        List<List<Integer>> Res=new ArrayList<>();// Storing our subsets .
        for(int i=0;i<limit;i++){
            List<Integer> set=new ArrayList<>();
            int temp=i;
            for(int j=nums.length-1;j>=0;j--){
                int r=temp%2;
                temp/=2;
                if(r==0){
                    continue;    
                }else{
                    set.add(nums[j]);
                }
            }
            Res.add(set);
        }return Res;
    }
}
