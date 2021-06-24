class GfG{
    Node flatten(Node root){
	    if(root==null){
	        return null;
	    }
	    else if(root.next==null){
	        return root;
	    }
	    Node curr=root,nxt=root.next;
	    while(curr!=null && nxt!=null){
	        curr=Merge(curr,nxt);
	        root=root.next;
	        nxt=root.next;
	    }
	    return curr;
    }
    public Node Merge(Node x,Node y){
        Node head=new Node(-1);Node temp=head;
        while(x!=null && y!=null){
            if(x.data>y.data){
                head.bottom=y;
                y=y.bottom;
                head=head.bottom;
            }else{
                head.bottom=x;
                x=x.bottom;
                head=head.bottom;
            }
        }
        if(x!=null){
            head.bottom=x;
        }
        if(y!=null){
            head.bottom=y;
        }return temp.bottom;
    }
}
