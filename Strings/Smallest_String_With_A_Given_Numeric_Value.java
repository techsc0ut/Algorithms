class Solution {
    public String getSmallestString(int n, int k) {
        char res[]=new char[n];
        Arrays.fill(res,'a');
        k-=n;
        while(k!=0){
            int min=Math.min(25,k);
            res[--n]+=min;
            k-=min;
        }
        return String.valueOf(res);
    }
}
