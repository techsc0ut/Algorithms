class Solution{
    public static Node addOne(Node head){ 
        if(head.next==null){
            head.data=head.data+1;
            return head;
        }
        head=rev(head);
        int d=head.data+1;
        if(d>9){
            head.data=0;
            Node curr=head.next;
            Node prv=null;
            while(curr!=null){
                if(curr.data+1>9){
                    curr.data=0;    
                }else{
                    curr.data=curr.data+1;
                    head=rev(head);
                    return head; 
                }
                prv=curr;
                curr=curr.next;
            }
            Node one=new Node(1);
            prv.next=one;
            head=rev(head);
            return head;
        }else{
            head.data=head.data+1;
            head=rev(head);
            return head;
        }
    }
    static Node rev(Node head){
        Node prev=null,nxt=null,curr=head;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}
