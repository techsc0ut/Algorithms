class GfG{
    Node flatten(Node root){
        Node Head=null;
        while(root!=null){
            Head=Merge(Head,root);
            root=root.next;
        }
        return Head;
    }
    static Node Merge(Node r1, Node r2){
        Node temp=new Node(-1);
        Node head=temp;
        while(r1!=null && r2!=null){
            if(r1.data>r2.data){
                temp.bottom=r2;
                r2=r2.bottom;
            }else{
                temp.bottom=r1;
                r1=r1.bottom;
            }
            temp=temp.bottom;
        }
        if(r1!=null){
            temp.bottom=r1;
        }
        if(r2!=null){
            temp.bottom=r2;
        }
        return head.bottom;
    }
}
