class Solution {
    public boolean isValid(String s) {
        Stack<Character> S=new Stack();
        for(char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                S.push(c);
            }else{
                if(S.isEmpty()){
                    return false;
                }else if(c=='}' && S.peek()=='{'){
                    S.pop();
                }else if(c==']' && S.peek()=='['){
                    S.pop();
                }else if(c==')' && S.peek()=='('){
                    S.pop();
                }else{
                    return false;
                }
            }
        }
        return S.isEmpty()==true?true:false;
    }
}
