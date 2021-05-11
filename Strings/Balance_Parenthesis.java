class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {   int n=x.length();
        Stack<Character> S=new Stack();
        int f=1;
        for(int i=0;i<n;i++){
            char c=x.charAt(i);
            if(c=='{' || c=='['|| c=='('){
                S.push(c);
                f=0;
            }else if(c=='}'){
                if(!S.isEmpty() &&S.peek()=='{'){
                    S.pop();
                }else{
                    return false;
                }
            }else if(c==']'){
                if(!S.isEmpty() && S.peek()=='['){
                    S.pop();
                }else{
                    return false;
                }
            }else if(c==')'){
                if(!S.isEmpty() && S.peek()=='('){
                    S.pop();
                }else{
                    return false;
                }
            }
        }
        if(f!=1 && S.size()==0){
            return true;
        }
        return false;
    }
}
