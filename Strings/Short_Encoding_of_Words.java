/* O(NlogN) Time and O(N) Space */
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)->(b.length()-a.length()));
        StringBuilder Sb=new StringBuilder();
        for(String s:words){
            if(Sb.indexOf(s+"#")==-1){
                Sb.append(s+"#");
            }
        }return Sb.length();
    }
}

/* O(N^2) Time and O(N) Space */
class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> St=new HashSet<>(Arrays.asList(words));
        for(String s:words){
            for(int i=1;i<s.length();i++){
                St.remove(s.substring(i));
            }
        }
        int count=0;
        for(String s:St){
            count+=s.length()+1;
        }return count;
    }
}
