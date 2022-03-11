class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int iter=k%size;
        ListNode finalHead=head;
        for(int i=0;i<iter;i++){
            finalHead=func(finalHead);
        }
        return finalHead;
    }
    static ListNode func(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        while(head.next.next!=null) {
            head=head.next;
        }
        ListNode NewHead=head.next;
        head.next=null;
        NewHead.next=temp;
        return NewHead;
    }
}
