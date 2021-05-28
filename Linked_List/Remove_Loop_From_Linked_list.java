class Solution{
    public static void removeLoop(Node head){
        if(head==null || head.next==null){
            return;
        }
        int f=0;
        Node slow=head;
        Node fast=head;
        slow=slow.next;
        fast=fast.next.next;
        Node k=null;
        while(fast!=null && fast.next!=null){
            if(slow==fast){
                f=1;
                break;
            }
            k=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=head;
        if(f==1){
            if(slow==fast){
                k.next=null;
                return;
            }
            while(slow!=null && fast!=null){
                if(slow.next==fast.next){
                    fast.next=null;
                    return;
                }
                slow=slow.next;
                fast=fast.next;
            }
        }return;
    }
}
