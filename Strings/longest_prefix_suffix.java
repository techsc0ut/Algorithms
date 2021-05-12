class Solution {
    int lps(String str) {
        int n=ste.length();
        int ar[]=new int[n];
        int j=0,i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(j)){
                ar[i]=j+1;
                i++;
                j++;
            }else{
                if(j==0){
                    i++;
                }else{
                    j=ar[j-1];
                }
            }
        }
      return ar[n-1];
    }
}
