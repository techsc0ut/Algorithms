class Solution{
    public long findMinDiff (ArrayList<Long> a, long n, long m){
        Collections.sort(a);
        long max=Long.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            long aa=a.get((int)i);
            long b=a.get((int)(i+m-1));
            if(max>b-aa){
                max=b-aa;
            }
        }
        return max;
    }
}
