
static Node Merge(Node left,Node right){
        Node temp=new Node(1);Node x=temp;
        while(left!=null && right!=null){
            if(left.data>right.data){
                x.next=right;
                right=right.next;
            }else if(left.data<=right.data){
                x.next=left;
                left=left.next;
            }
            x=x.next;
        }
        if(left!=null){
            x.next=left;
        }
        if(right!=null){
            x.next=right;
        }
        return temp.next;
}
