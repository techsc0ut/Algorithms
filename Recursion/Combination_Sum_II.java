class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> Res=new ArrayList<>();
        func(0,candidates,target,new ArrayList<Integer>(),Res);
        return Res;
    }
    static void func(int idx,int []ar,int target,List<Integer> ds,
                    List<List<Integer>> Res){
        if(target==0){
            Res.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=idx;i<ar.length;i++){
            if(target<ar[i]){
                return;
            }
            if (i==idx || (i>idx && ar[i] != ar[i-1])) {
                ds.add(ar[i]);
                func(i+1,ar,target-ar[i],ds,Res);
                ds.remove(ds.size()-1);
            }
        }
    }
   
}
