class Solution {
    int isSame(String s) {
        int n=s.length();
        int num=0,d=1;int i=n-1;
        for(i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                int x=c-'0';
                num=num+x*d;
                d*=10;
                if(num>=n){
                    return 0;
                }
            }else{
                break;
            }
        }return num==i+1?1:0;
    }
}
