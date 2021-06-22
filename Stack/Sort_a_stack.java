class GfG{
	public Stack<Integer> sort(Stack<Integer> s){
        sort_stack(s);
        return s;
	}
	static void sort_stack(Stack<Integer> s){
	    if(!s.isEmpty()){
	        int x=s.pop();
	        sort_stack(s);
	        sort_inserted(s,x);
	    }
	}
	static void sort_inserted(Stack<Integer> s,int x){
	    if(s.isEmpty() || x>s.peek()){
	        s.push(x);
	    }else{
	        int temp=s.pop();
	        sort_inserted(s,x);
	        s.push(temp);
	    }
	}
}
