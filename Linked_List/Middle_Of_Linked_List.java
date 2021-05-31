class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.next==null){
            return head.next;
        }
        ListNode slow=head,fast=head;
        slow=slow.next;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
