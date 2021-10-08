class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }        
        ListNode curHead=head;
        ListNode varHead=curHead;
        int i=1;
        while(i!=k && curHead!=null){
            curHead=curHead.next;
            i++;
        }
        if(curHead==null){
            return head;
        }else{
            ListNode nxt=curHead.next;
            curHead.next=null;
            ListNode rHead=rev(varHead);
            varHead.next=reverseKGroup(nxt,k);
            return rHead;
        }
    }
    static ListNode rev(ListNode head){
        ListNode curr=head , prev=null , nxt=null ;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }return prev;
    }
}
