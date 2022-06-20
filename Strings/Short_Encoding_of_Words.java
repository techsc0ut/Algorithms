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
