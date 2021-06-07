class Solution{
    Node divide(int N, Node head){
        Node even=new Node(-1);Node odd=new Node(-1);
        Node e=even,o=odd;
        while(head!=null){
            if((head.data)%2==0){//even
                even.next=new Node(head.data);
                even=even.next;
            }else{//odd
                odd.next=new Node(head.data);
                odd=odd.next;
            }
            head=head.next;
        }
        if(e.next==null){
            return o.next;
        }
        if(o.next==null){
            return e.next;
        }
        even.next=o.next;
        return e.next;
    }
}
