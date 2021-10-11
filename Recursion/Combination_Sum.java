class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> Res=new ArrayList<>();
        func(Res,new ArrayList<>(),target,candidates,0);
        return Res;
    }
    static void func(List<List<Integer>> Res,List<Integer> ds,int target,int [] candidates,int ind){
        if(ind==candidates.length){
            if(target==0){
                Res.add(new ArrayList<>(ds));
            }return ;
        }
        if(candidates[ind]<=target){
            ds.add(candidates[ind]);
            func(Res,ds,target-candidates[ind],candidates,ind);
            ds.remove(ds.size()-1);
        }
        func(Res,ds,target,candidates,ind+1);
    }
}
