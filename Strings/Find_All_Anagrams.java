class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> Lst=new ArrayList<>();
        int s_len=s.length();
        int p_len=p.length();
        if(p_len>s_len){
            return Lst;
        }else if(p_len==s_len){
            if(check_anagram(s,p)){
                Lst.add(0);
                return Lst;
            }
        }else{
            for(int i=0;i<=s_len-p_len;i++){
                String sub=s.substring(i,i+p_len);
                if(check_anagram(sub,p)){
                    Lst.add(i);
                }
            }
        }return Lst;
    }
    static boolean check_anagram(String s, String p){
        int s_len=s.length();
        int p_len=p.length();
        char ar[]=new char[27];
        for(int i=0;i<s_len;i++){
            ar[s.charAt(i)-'a']++;
        }
        for(int i=0;i<p_len;i++){
            ar[p.charAt(i)-'a']--;
        }
        for(int i=0;i<=26;i++){
            if(ar[i]!=0){
                return false;
            }
        }
        return true;
    }
}
