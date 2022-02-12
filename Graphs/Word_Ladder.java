class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> S=new HashSet<>(wordList);
        if(!S.contains(endWord)) return 0;
        Queue<String> Q=new LinkedList<>();
        int depth=0;
        Q.add(beginWord);
        while(!Q.isEmpty()){
            depth++;
            int lsize=Q.size();
            for(int i=0;i<lsize;i++){
                String curr=Q.poll();
                for(int k=0;k<curr.length();k++){
                    for(char c='a';c<='z';c++){
                        String temp=curr.substring(0,k)+c+curr.substring(k+1);
                        if(curr.equals(temp)) continue;
                        else if(endWord.equals(temp)) return depth+1;
                        else if(S.contains(temp)){
                            Q.add(temp);
                            S.remove(temp);
                        }
                    }                    
                }
            }
        }return 0;
    }
}
