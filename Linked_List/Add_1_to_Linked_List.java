class Solution{
    public static Node addOne(Node head){ 
        Node revH=rev(head);
        Node H=revH;
        while(H!=null){
            if(H.data+1<=9){
                H.data=H.data+1;
                break;
            }else{
                H.data=0;
                if(H.next==null){
                    Node x=new Node(1);
                    x.next=null;
                    H.next=x;break;
                }else{
                    H=H.next;
                }
            }
        }
        return rev(revH);
    }
    static Node rev(Node head){
        Node curr=head,prv=null,nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prv;
            prv=curr;
            curr=nxt;
        }return prv;
    }
}
