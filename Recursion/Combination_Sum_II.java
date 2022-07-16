class Solution {
    List<List<Integer>> Res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Res=new ArrayList<>();
        func(0,new ArrayList<Integer>(),target,candidates);
        return Res;
    }
    public void func(int i, ArrayList<Integer> curr, int total, int candidates[]){
        if(total==0){
            Res.add(new ArrayList<>(curr));
            return;
        }
        if(total<0){
            return;
        }
        int prev=-1;
        for(int start=i;start<candidates.length;start++){
            if(candidates[start]==prev){
                continue;
            }
            curr.add(candidates[start]);
            func(start+1,curr,total-candidates[start],candidates);
            curr.remove(curr.size()-1);
            prev=candidates[start];
        }
    }
}
