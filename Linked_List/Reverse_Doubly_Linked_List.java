public static Node reverseDLL(Node  head){
    Node curr=head,prev=null,nxt=null;
    while(curr!=null){
        nxt=curr.next;
        curr.next=prev;
        curr.prev=nxt;
        prev=curr;
        curr=nxt;
    }return prev;
}
