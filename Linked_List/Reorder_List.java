class gfg {
    Node reorderlist(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node l1=head;
        Node slow=head, fast=head , prev=null ;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        Node l2=rev(slow);
        Merge(l1,l2);
        return head;
    }
    static Node rev(Node head){
        Node curr=head , prev=null , nxt=null ;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }return prev;
    }
    static void Merge(Node l1,Node l2){
        while(l1!=null){
            Node l1_next=l1.next;
            Node l2_next=l2.next;
            
            l1.next=l2;
            if(l1_next==null){
                break;
            }
            l2.next=l1_next;
            l1=l1_next;
            l2=l2_next;
        }
    }
}
