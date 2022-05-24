/* O(n) and O(n) */
class Solution {
    public int longestValidParentheses(String s) {
        int len=s.length();
        int ans=0;
        Stack<Integer> S=new Stack<>();
        S.push(-1);
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='('){
                S.push(i);
            }else{
                S.pop();
                if(S.isEmpty()){
                    S.push(i);
                }else{
                    int x=i-S.peek();
                    ans=Math.max(ans,x);
                }
            }
        }return ans;
    }
}

/* O(n) and O(1) */
class Solution {
    public int longestValidParentheses(String s) {
        int len=s.length();
        int ans=0, open=0, close=0;
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }else{
                close++;
            }
            if(open==close){
                ans=Math.max(ans,2*open);
            }else if(close>=open){
                open=0;
                close=0;
            }
        }
        open=0;close=0;
        for(int i=len-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }else{
                close++;
            }
            if(open==close){
                ans=Math.max(ans,2*open);
            }else if(open>=close){
                open=0;
                close=0;
            }
        }return ans;
    }
}
