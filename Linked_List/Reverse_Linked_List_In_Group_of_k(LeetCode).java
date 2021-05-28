class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int ind=0;ListNode c=head;
        while(c!=null){
            ind++;
            c=c.next;
        }
        if(ind<k){// Check if the remaining elements have size greater or equal to k , then only reverse , otherwise keep as it is .
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
