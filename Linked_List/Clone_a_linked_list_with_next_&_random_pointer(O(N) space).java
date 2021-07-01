class Solution {
    public Node copyRandomList(Node head){
        HashMap<Node,Node> H=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            H.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            Node x=H.get(curr);
            Node y=H.get(curr.next);
            x.next=y;
            if(curr.random==null){
                x.random=null;
            }else{
                Node ran=H.get(curr.random);
                x.random=ran;
            }
            curr=curr.next;
        }return H.get(head);
    }
}
