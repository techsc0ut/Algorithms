class Solution{
    static Node addTwoLists(Node first, Node second){
        Node revF=rev(first),revS=rev(second);
        int c=0;Node Head=new Node(-1);Node x=Head;
        while(revF!=null || revS!=null){
            int a=revF==null?0:revF.data;
            int b=revS==null?0:revS.data;
            int z=a+b+c;
            if(z>9){
                x.next=new Node(z%10);
                c=1;
                x=x.next;
            }else{
                x.next=new Node(z);
                c=0;
                x=x.next;
            }
            if(revF!=null){
                revF=revF.next;
            }
            if(revS!=null){
                revS=revS.next;
            }
        }
        if(c==1){
            Node v=new Node(1);
            v.next=null;
            x.next=v;
        }
        return rev(Head.next);
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
