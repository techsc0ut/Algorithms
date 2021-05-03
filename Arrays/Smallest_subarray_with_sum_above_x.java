class Solution {
    public static long sb(long a[], long n, long x) {
        int i=0;
        int j=0;
        int N=(int)n;
        long cursum=0;
        int minL=(int)n+1;
        while(j<N){
            while(cursum<=x && j<n){
                cursum+=a[j++];
            }
            while(cursum>x && i<j){
                minL=Math.min(minL,j-i);
                cursum-=a[i++];
            }
        }
        return minL;   
    }
}
