class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==0){
            return 0;
        }
        Set<Character> S=new HashSet<>();
        int ans=1;
        int l=0 , r=0;
        while(r<len){
            char c=s.charAt(r);
            if(S.contains(c)){
                S.remove(s.charAt(l++));
            }else{
                ans=Math.max(ans,r-l+1);
                S.add(c);
                r++;
            }
        }return ans;
    }
}
