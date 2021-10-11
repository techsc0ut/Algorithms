class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> H=new HashSet<>();
        func(0,new ArrayList<Integer>(),H,nums);
        List<List<Integer>> Res=new ArrayList<>(H);
        return Res;
    }
    static void func(int idx,List<Integer> Set,HashSet<List<Integer>> H,int [] nums){
        if(idx==nums.length){
            H.add(new ArrayList<>(Set));
            return ;
        }
        /*  
            Here We are adding and removing in set 
            is because , first we take the current 
            element into the set and not take in other case
        */
        Set.add(nums[idx]);
        func(idx+1,Set,H,nums);
        Set.remove(Set.size()-1);
        func(idx+1,Set,H,nums);
    }
}
