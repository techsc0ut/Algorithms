public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        boolean isCycle=false;
        ListNode slow=head , fast=head ;
        slow=slow.next;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast){
                isCycle=true;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(isCycle){
            if(slow==head){
                return head;
            }else{
                while(head!=slow){
                    head=head.next;
                    slow=slow.next;
                }return head;
            }
        }
        return null;
    }
}
