class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null){
            return null;
        }
        
        ListNode curr=head, prev=null;
        while(m>1){
            prev=curr;
            curr=curr.next;
            n--;
            m--;
        }
        
        ListNode con=prev, tail=curr, nxt=null;
        while(n>0){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            n--;
        }
        
        if(con!=null){
            con.next=prev;
        }else{
            head=prev;
        }
        
        tail.next=curr;
        return head;
    }
}
