// Remove Duplicates from Sorted List II - LeetCode .
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      if(head==null || head.next==null){
	        return head;
	    }
      ListNode prev=null;
	    ListNode cur=head;
	    ListNode nxt=head.next;
	    while(cur!=null && nxt!=null){
	        if(cur.val==nxt.val){
                if(cur==head){
                    ListNode x=cur;
                    int a=cur.val;
                    ListNode pre=null;
                    while(x!=null && x.val==a){
                        pre=x;
                        x=x.next;
                    }
                    if(x==null){
                        return null;
                    }else{
                        head=x; 
                        cur=head;
                        nxt=cur.next;
                    }
                }else{
                    ListNode c=cur.next;
                    int d=cur.val;
                    while(c!=null && c.val==d){
                        c=c.next;
                    }
                    if(c==null){
                        prev.next=null;
                        return head;    
                    }else{
                        prev.next=c;
                        cur=c;
                        nxt=c.next;
                    }
                }
	        }
	        else{
              prev=cur;
	            cur=cur.next;
	            nxt=nxt.next;    
	        }
	    }
	    return head;
    }
}
