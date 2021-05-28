class Solution{
    public static Node reverse(Node node, int k){   
        int i=0;
        Node prev=null,nxt=null,curr=node;
        while(i<k && curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            i++;
        }
        if(nxt!=null){
            node.next=reverse(nxt,k);
        }
        return prev;
    }
}
