class Solution {
    public Node copyRandomList(Node head) {
        Node curr=head;
        HashMap<Node,Node> H=new HashMap<>();
        while(curr!=null){
            H.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            Node org=H.get(curr);
            org.next=H.get(curr.next);
            org.random=H.get(curr.random);
            curr=curr.next;
        }return H.get(head);
    }
}
