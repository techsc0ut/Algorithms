/* Double Queue O(1) push O(n) pop */
class MyStack {
    Queue<Integer> Q1, Q2;
    int size=0;
    int top=-1;
    public MyStack() {
        Q1=new LinkedList<>();
        Q2=new LinkedList<>();
    }
    
    public void push(int x) {
        Q1.offer(x);
        size++;
        top=x;
    }
    
    public int pop() {
        if(Q1.size()==1){
            size--;
            return Q1.poll();
        }
        Q2=new LinkedList<>();
        int t=-1;
        int i=0;
        while(!Q1.isEmpty()){
            i++;
            t=Q1.poll();
            System.out.println(i+" $ "+t+" & "+size);
            if(i<size){
                Q2.offer(t);
                top=t;
            }
        }
        Q1=Q2;
        size--;
        return t;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return size==0;
    }
}


/* Single Queue O(n) push and O(1) pop */
class MyStack {
    Queue<Integer> Q1;
    int size=0;
    public MyStack() {
        Q1=new LinkedList<>();
    }
    
    public void push(int x) {
        Q1.offer(x);
        int sz=Q1.size();
        while(sz>1){
            Q1.offer(Q1.remove());
            sz--;
        }
        size++;
    }
    
    public int pop() {
        size--;
        return Q1.poll();
        
    }
    
    public int top() {
        return Q1.peek();
    }
    
    public boolean empty() {
        return size==0;
    }
}
