class Solution{
    public int NthRoot(int n, int m){
        if(n==1){
            return m;
        }
        if(m==1){
            return 1;
        }
        int a=1;
        int b=m;
        while(a<b){
            int mid=(a+b)/2;
            int x=(int)Math.pow(mid,n);
            if(x==m){
                return mid;
            }else if(x>m){
                b=mid;
            }else{
                a=mid+1;
            }
        }
        return -1;
    }
}
