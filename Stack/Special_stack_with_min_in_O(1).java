class GfG{
    int minElement;
	public void push(int a,Stack<Integer> s){
	    if(s.isEmpty()){
	        minElement=a;
	        s.push(a);
	    }else{
	        if(a<minElement){
	            s.push(2*minElement-a);
	            minElement=a;
	        }else{
	            s.push(a);
	        }
	    }
	}
	public int pop(Stack<Integer> s){
        if(s.isEmpty()){
            return -1;
        }
        int x=s.pop();
        if(x<minElement){
            minElement=2*minElement-x;
        }
        return x;
	}
	public int min(Stack<Integer> s){
        if(!s.isEmpty()){
            return minElement;
        }return -1;
	}
	public boolean isFull(Stack<Integer>s, int n){
           return s.size()==n?true:false;
	}
	public boolean isEmpty(Stack<Integer>s){
           return s.isEmpty()==true?true:false;
	}
}
