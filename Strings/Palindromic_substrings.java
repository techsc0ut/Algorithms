/*1. BRUTEFORCE */
class Solution {
    public int countSubstrings(String s) {
        int len=s.length();
        int ans=0;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(isPalindrome(s.substring(i,j+1))){
                    //System.out.println(s.substring(i,j));
                    ans++;
                }
            }
        }return ans;
    }
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }i++;j--;
        }return true;
    }
}
/*________________________________________________________________________________*/

/* 2 POINTER APPROACH */
class Solution {
    public int countSubstrings(String s) {
        int len=s.length();
        int ans=0;
        for(int i=0;i<len;i++){
            int l=i, r=i;
            while(l>=0 && r<len && s.charAt(l)==s.charAt(r)){
                ans++;
                l--;r++;
            }
            
            l=i;r=i+1;
            while(l>=0 && r<len && s.charAt(l)==s.charAt(r)){
                ans++;
                l--;r++;
            }
        }return ans;
    }
}
