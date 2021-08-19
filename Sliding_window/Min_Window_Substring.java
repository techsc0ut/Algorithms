/*

  1. You are given two strings s1 and s2 containing lowercase english alphabets.
  2. You have to find the smallest substring of s that contains all the characters of string t(including duplicates).
  3. If no such substring exists, print blank string("").

*/

public static String solution(String s, String t){
	    if(t.length() == 1){
            for(int i = 0 ; i < s.length(); i++){
                if(s.charAt(i) == t.charAt(0)){
                    return t;
                }
            }
            return "";
        }
		String ans="";
        HashMap<Character,Integer> T=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            T.put(c,T.getOrDefault(c,0)+1);
        }
        int act=0;
        int rct=t.length();
        HashMap<Character,Integer> H=new HashMap<>();
        int i=-1 , j=-1;
        while(true){
            boolean f1=false , f2=false ;
            while(i<s.length()-1 && act<rct){
                i++;
                char c=s.charAt(i);
                H.put(c,H.getOrDefault(c,0)+1);
                if(H.getOrDefault(c,0)<=T.getOrDefault(c,0)){
                    act++;
                }
                f1=true;
            }
            while(j<i && act==rct){
                String curr=s.substring(j+1,i+1);
                if(ans.length()==0 || curr.length()<ans.length()){
                    ans=curr;
                }
                j++;
                char c=s.charAt(j);
                if(H.get(c)==1){
                    H.remove(c);
                }else{
                    H.put(c,H.get(c)-1);
                }
                if(H.getOrDefault(c,0)<T.getOrDefault(c,0)){
                    act--;
                }
                f2=true;
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
	}
