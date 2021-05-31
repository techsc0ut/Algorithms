class GfG{
    boolean isCircular(Node head){
        if(head==null){
            return false;
        }
	    if(head.next==null){
	        return false;
	    }
	    Node x=head.next;
	    while(x!=null){
	        if(x==head){
	            return true;
	        }
	        x=x.next;
	    }
	    return false;
    }
}
