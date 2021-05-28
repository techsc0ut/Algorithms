class GfG{
    Node removeDuplicates(Node head){
	    if(head==null || head.next==null){
	        return head;
	    }	
	    Node cur=head;
	    Node nxt=head.next;
	    while(cur!=null && nxt!=null){
	        if(cur.data==nxt.data){
	            Node x=nxt.next;
	            cur.next=x;
	            nxt=x;
	        }
	        else{
	            cur=cur.next;
	            nxt=nxt.next;    
	        }
	    }
	    return head;
    }
}
