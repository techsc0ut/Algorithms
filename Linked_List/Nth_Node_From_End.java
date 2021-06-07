class GfG{
    int getNthFromLast(Node head, int n){
    	int i=0;Node curr=head;
    	while(curr!=null){
    	    i++;
    	    curr=curr.next;
    	}
    	if(n>i){
    	    return -1;
    	}
        curr=head;
        int u=0;
        while(u<i-n){
            curr=curr.next;
            if(curr==null){
                break;
            }
            u++;
        }
        if(curr==null){
            return -1;
        }
        return curr.data;
    }
}
