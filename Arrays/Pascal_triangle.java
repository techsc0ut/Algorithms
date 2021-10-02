class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr , pre=null;
        for(int i=0;i<numRows;i++){
            curr=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    curr.add(1);
                }else{
                    curr.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=curr;
            res.add(curr);
        }return res;
    }
}
