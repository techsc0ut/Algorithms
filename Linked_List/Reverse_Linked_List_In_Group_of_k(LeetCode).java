class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int ind=0;ListNode c=head;
        while(c!=null){
            ind++;
            c=c.next;
        }
        if(ind<k){
            return head;
        }
        ListNode Curr=head,nxt=null,prev=null;
        int i=0;
        while(i<k && Curr!=null){
            nxt=Curr.next;
            Curr.next=prev;
            prev=Curr;
            Curr=nxt;
            i++;
        }
        if(nxt!=null){
            head.next=reverseKGroup(nxt,k);
        }
        return prev;
    }
}
