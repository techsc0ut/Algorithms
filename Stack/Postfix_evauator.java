class Solution{
    public static int evaluatePostFix(String S){
        int n=S.length();
        Stack<Integer> St=new Stack<>();
        for(int i=0;i<n;i++){
            char c=S.charAt(i);
            if(c=='+' || c=='-' || c=='/' || c=='*'){
                int b=St.pop();
                int a=St.pop();
                int z;
                if(c=='+'){
                    z=a+b;
                }else if(c=='-'){
                    z=a-b;
                }else if(c=='*'){
                    z=a*b;
                }else{
                    z=a/b;
                }
                St.push(z);
            }else{
                St.push(c-'0');
            }
        }
        return St.pop();
    }
}
