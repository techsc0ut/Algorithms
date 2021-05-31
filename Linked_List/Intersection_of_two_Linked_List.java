class Sol{
    public static Node findIntersection(Node head1, Node head2){
        Node curr1=head1,curr2=head2,Head=new Node(1),x=Head;
        while(curr1!=null && curr2!=null){
            if(curr1.data>curr2.data){
                curr2=curr2.next;
            }else if(curr1.data<curr2.data){
                curr1=curr1.next;
            }else{
                Head.next=new Node(curr1.data);
                Head=Head.next;
                curr1=curr1.next;
                curr2=curr2.next;
            }
        }
        return x.next;
    }
}
