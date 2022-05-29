/* NAIVE BRUTE APPROACH (TLE) */
class Solution {
    public int maxProduct(String[] words) {
        Arrays.sort(words,(a1,a2)->(a2.length()-a1.length()));
        //String prev=words[0];
        for(String x:words){
            System.out.print(x+" ");
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(!check(words[i],words[j])){
                    ans=Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
    public boolean check(String s1, String s2){
        Set<Character> S=new HashSet();
        for(int i=0;i<s1.length();i++){
            S.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(S.contains(s2.charAt(i))){
                return true;
            }
        }return false;
    }
}

/* BIT MANIPULATION APPROACH (ACCEPTED) */
class Solution {
    public int maxProduct(String[] words) {
        int state[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            state[i]=findState(words[i]);
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((state[i] & state[j])==0){
                    ans=Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }return ans;
    }
    public int findState(String s){
        int state=0;
        for(char c:s.toCharArray()){
            int a=c-'a';
            state=state | 1<<a;
        }return state;
    }
}
