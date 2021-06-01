class Solution{
    boolean isPalindrome(Node head){
        if(head.next==null){
            return true;
        }
        if(head.next.next==null){
            if(head.data==head.next.data){
                return true;
            }return false;
        }
        Node slow=head,prev=slow,fast=head;slow=slow.next;fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            prev=slow;fast=fast.next.next;slow=slow.next;
        }
        if(fast==null){//even list
            prev.next=null;
            Node a=rev(head);
            while(a!=null && slow!=null){
                if(a.data!=slow.data){
                    return false;
                }
                a=a.next;slow=slow.next;
            }return true;
        }else{//odd list
            prev.next=null;
            slow=slow.next;
            Node a=rev(head);
            while(a!=null && slow!=null){
                if(a.data!=slow.data){
                    return false;
                }
                a=a.next;slow=slow.next;
            }return true;
        }
    }  
    static Node rev(Node head){
        Node curr=head,nxt=null,prev=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;      
            
        }return prev;
    }
}
