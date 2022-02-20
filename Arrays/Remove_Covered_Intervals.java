class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        if(intervals.length<=1){
            return intervals.length;
        }
        Arrays.sort(intervals,(ar1,ar2)->Integer.compare(ar1[0],ar2[0])); 
        List<int[]> Lst=new ArrayList<>();
        int [] current=intervals[0];
        Lst.add(current);
        for(int[] intv:intervals){
            int curbeg=current[0];
            int curend=current[1];
            int nextbeg=intv[0];
            int nextend=intv[1];
            if((curbeg<=nextbeg && nextend<=curend)){
                current[1]=Math.max(curend,nextend);
            }else if(curbeg==nextbeg && nextend>=curend){
                current[1]=nextend;
            }
            else{
                current=intv;
                Lst.add(current);
            }
        }
        return Lst.size();
    }
}
