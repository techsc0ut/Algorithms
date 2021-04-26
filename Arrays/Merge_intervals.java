// Thanks to Nick White for this solution.
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(ar1,ar2)->Integer.compare(ar1[0],ar2[0])); // Sorting Based on First value of each elements .
        List<int[]> F=new ArrayList();
        int [] current=intervals[0];
        F.add(current);
        for(int[] intv:intervals){
            int curbeg=current[0];
            int curend=current[1];
            int nextbeg=intv[0];
            int nextend=intv[1];
            if(curend>=nextbeg){
                current[1]=Math.max(curend,nextend);
            }else{
                current=intv;
                F.add(current);
            }
        }
        return F.toArray(new int[F.size()][]); // Returning the result in array form .
    }
}
