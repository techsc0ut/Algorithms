class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node curr=head;
        while(curr!=null){
            Node x=new Node(curr.val);
            Node nxt=curr.next;
            curr.next=x;
            x.next=nxt;
            curr=nxt;
        }
        curr=head;
        while(curr!=null){
            Node r=curr.random;
            Node cl=curr.next;
            cl.random=r==null?null:r.next;
            curr=cl.next;
        }
        curr=head;
        Node HEAD=curr.next;
        while(curr!=null){
            Node cl=curr.next;
            Node clnxt=cl.next;
            if(clnxt!=null){
                cl.next=clnxt.next;
            }
            curr.next=clnxt;
            curr=curr.next;
        }return HEAD;
    }
}
