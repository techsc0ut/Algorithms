class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        } 
        ListNode slow = head , fast = head , prev = null ;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode r=null;
        if(fast==null){ // even
            r=rev(slow);
        }else{ //odd
            r=rev(slow.next);
        }
        while(head!=null && r!=null){
            if(head.val!=r.val){
                return false;
            }
            head=head.next;
            r=r.next;
        }return true;
    }
    static ListNode rev(ListNode head){
        ListNode curr=head , prev=null , nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }return prev;
    }
}
