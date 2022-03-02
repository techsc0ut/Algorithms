class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true; // Empty String always a subsequence for t.
        int index=0;
        int len=t.length();
        for(int i=0;i<len && index<s.length();i++){ 
            if(s.charAt(index)==t.charAt(i)){
                index++;
            }
        }
        return index==s.length()?true:false;
    }
}
