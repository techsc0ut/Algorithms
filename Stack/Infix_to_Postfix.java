class Solution{
    static int prec(char c){
        switch(c){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
        }return -1;
    }
	public static String infixToPostfix(String exp){
	    int n=exp.length();
	    String res="";
	    Stack<Character> S=new Stack<>();
	    for(int i=0;i<n;i++){
	       char c=exp.charAt(i);
	       if(Character.isLetter(c)){
	           res+=c;
	       }else if(c=='('){
	           S.push(c);
	       }else if(c==')'){
	           while(!S.isEmpty() && S.peek()!='('){
	               res+=S.pop();
	           }
	           S.pop();
	       }else{
	           while(!S.isEmpty() && prec(S.peek())>=prec(c)){
	               res+=S.pop();
	           }
	           S.push(c);
	       }
	    }
	    while(!S.isEmpty()){
	        res+=S.pop();
	    }return res;
	} 
}
