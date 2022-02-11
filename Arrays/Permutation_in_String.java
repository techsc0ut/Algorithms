class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 > l2) return false;   // if string s1 is greater then return false; 
        int freq[] = new int[26];   
        for(int i=0;i<l1;i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        if(checkAnagram(freq)){
            return true;
        }
        for(int i=0;i<l2-l1;i++){
            if(checkAnagram(freq)){
                return true;
            }
            freq[s2.charAt(i)-'a']++;
            freq[s2.charAt(l1+i)-'a']--;
        }
        return checkAnagram(freq);
    }
    public boolean checkAnagram(int freq[]){
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }return true;
    }
}
