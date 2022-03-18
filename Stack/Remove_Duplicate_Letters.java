class Solution {
    public String removeDuplicateLetters(String s) {
        int last[]=new int[26];                           // Array storing last index of all occuring characters .
        boolean vis[]=new boolean[26];
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            last[c-'a']=i;
        }
        Stack<Character> St=new Stack();                  
        for(int i=0;i<len;i++){
            char curr=s.charAt(i);
            if(vis[curr-'a']){                            // if charcter is visited then ignore .
                continue;
            }
            while(!St.isEmpty() && (St.peek()-'a')>(curr-'a') && last[St.peek()-'a']>i){  
                vis[St.pop()-'a']=false;
            }
            St.push(curr);
            vis[curr-'a']=true;
        }
        StringBuilder Res=new StringBuilder();
        while(!St.isEmpty()){
            Res.append(St.pop());
        }
        return Res.reverse().toString();
    }
}
