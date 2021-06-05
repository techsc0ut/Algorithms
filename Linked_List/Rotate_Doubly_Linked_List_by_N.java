class Gfg {
    Node rotateP (Node head, int p){
        for(int i=0;i<p;i++){
            head=func(head);
        }
        return head;
    }
    Node func(Node head){
        Node curr=head;
        Node nxt=curr.next;
        nxt.prev=null;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        head.prev=curr;
        head.next=null;
        return nxt;
    }
}
