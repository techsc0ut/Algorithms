class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> Res=new ArrayList<>();
        subsets(0,nums,new ArrayList<>(),Res);
        return Res;
    }
    static void subsets(int ind,int nums[],List<Integer> ds,List<List<Integer>> Res){
        Res.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(ind!=i && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            subsets(i+1,nums,ds,Res);
            ds.remove(ds.size()-1);
        }
    }
}
