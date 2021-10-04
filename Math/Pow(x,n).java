class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        boolean isNeg=false;
        long nn=n;
        if(nn<0){
            nn*=-1;
            isNeg=true;
        }
        while(nn>0){
            if(nn%2==0){
                x*=x;
                nn/=2;
            }else{
                ans*=x;
                nn-=1;
            }
        }
        if(isNeg){
            return 1.0/ans;
        }
        return ans;
    }
}
