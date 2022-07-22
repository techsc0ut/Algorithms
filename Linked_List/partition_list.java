class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode old=head;
        ListNode ptr=new ListNode(-110);
        ListNode Head=ptr;
        ListNode ptr2=new ListNode(-110);
        ListNode temp=ptr2;
        while(head!=null){
            if(head.val>=x){
                ptr2.next=head;
                ptr2=ptr2.next;
            }else{
                ptr.next=head;
                ptr=ptr.next;
            }head=head.next;
        }
        if(ptr2.val==-110){
            return old;
        }
        ptr2.next=null;
        ptr.next=temp.next;
        return Head.next;
    }
}
