class MyCircularQueue {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node rear,front;
    final int capacity;
    int size;
    public MyCircularQueue(int k) {
        this.capacity=k;
        this.size=0;
        rear=front=null;
    }
    
    public boolean enQueue(int value) {
        Node n=new Node(value);
        if(isEmpty()){
            front=rear=n;
            size++;
            return true;
        }else if(!isFull()){
            rear.next=n;
            rear=n;
            rear.next=front;
            size++;
            return true;
        }return false;
    }
    
    public boolean deQueue() {
        if(front!=null && front==rear){
            front=rear=null;
            size--;
            return true;
        }else if(!isEmpty()){
            front=front.next;
            rear.next=front;
            size--;
            return true;
        }return false;
    }
    
    public int Front() {
        if(!isEmpty()){
            return front.data;
        }return -1;
    }
    
    public int Rear() {
        if(!isEmpty()){
            return rear.data;
        }return -1;
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }return false;    
    }
    
    public boolean isFull() {
        if(size==capacity){
            return true;
        }return false;
    }
}
