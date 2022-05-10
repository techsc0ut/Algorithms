class Solution {
    List<List<Integer>> Res;
    List<Integer> temp; 
    public List<List<Integer>> combinationSum3(int k, int n) {
        Res=new ArrayList<>();
        temp=new ArrayList<>();
        Func(n,temp,1,k);
        return Res;
    }
    public void Func(int target, List<Integer> temp, int sz, int k){
        if(target==0 && temp.size()==k){
            Res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=sz;i<=9;i++){
            temp.add(i);
            Func(target-i,temp,i+1,k);
            temp.remove(temp.size()-1);
        }
    }
}
