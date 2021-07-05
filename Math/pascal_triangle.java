class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> L=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        L.add(a);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=L.get(i-1);
            List<Integer> x=new ArrayList<>();
            x.add(1);
            for(int j=1;j<i;j++){
                x.add(prevRow.get(j-1)+prevRow.get(j));
            }
            x.add(1);
            L.add(x);
        }return L;
    }
}
