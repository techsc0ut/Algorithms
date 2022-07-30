class Solution {
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> Res=new ArrayList<>();
        int maxFreq[]=new int[26];
        helper(maxFreq,words2); 
        for(String s:words1){
            if(check(s,maxFreq)){
                Res.add(s);
            }
        }
        return Res;
    }
    
    public int[] getFreq(String s){
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        return freq;
    }
    
    public void helper(int[] maxFreq, String[] words2){
        for(String s:words2){
            int Freq[]=getFreq(s);
            for(int i=0;i<Freq.length;i++){
                maxFreq[i]=Math.max(maxFreq[i],Freq[i]);
            }
        }
    }
    
    public boolean check(String s, int[] maxFreq){
        int freq[]=getFreq(s);
        for(int i=0;i<26;i++){
            if(freq[i]<maxFreq[i]){
                return false;
            }
        }
        return true;
    }
    
}
