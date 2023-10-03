class Solution {

    List<String> res;

    public List<String> wordBreak(String s, List<String> Dict) {

        Set<String> wordDict = new HashSet<>(Dict);
        
        res = new ArrayList<>();

        helper(0, s, "", wordDict);

        return res;

    }

    public void helper(int idx, String s, String curr, Set<String> wordDict){

        if(idx == s.length()){

            res.add(curr.trim());
            return;

        }

        for(int i = idx; i < s.length(); i++){

            if(wordDict.contains(s.substring(idx, i + 1))){

                String temp = curr + " " + s.substring(idx, i + 1);

                helper(i + 1, s, temp, wordDict);

            }
        }
    }
}
