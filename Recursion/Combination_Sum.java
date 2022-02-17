class Solution {
    static List<List<Integer>> Res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Res=new ArrayList<>();
        func(candidates,target,0,new ArrayList<>());
        return Res;
    }
    public void func(int[] candidates, int target, int index, List<Integer> Lst){
        if(target==0){
            Res.add(new ArrayList<>(Lst));
            return;
        }
        if(index>=candidates.length || target<0) return;
        for(int i=index;i<candidates.length;i++){
            Lst.add(candidates[i]);
            func(candidates,target-candidates[i],i,Lst);
            Lst.remove(Lst.size()-1);
        }return;
    }
}
