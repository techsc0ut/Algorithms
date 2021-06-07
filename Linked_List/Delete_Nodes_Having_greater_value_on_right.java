class Solution{
    Node compute(Node head){
        Node r=rev(head),max=r;
        Node temp=new Node(-1);Node x=temp;temp.next=max;temp=temp.next;
        while(r!=null && r.next!=null){
            if(r.next.data<max.data){
               r=r.next;
            }else{
               temp.next=r.next;
               temp=temp.next;
               max=r.next;
               r=r.next;
            }
        }
        temp.next=null;
        return rev(x.next);
    }
    static Node rev(Node head){
        Node curr=head,prev=null,nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }return prev;
    }
}
  
