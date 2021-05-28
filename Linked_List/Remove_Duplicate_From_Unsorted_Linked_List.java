class Solution{
    public Node removeDuplicates(Node head) {
         if(head==null || head.next==null){
             return head;
         }
         Set<Integer> S=new HashSet();
         Node curr=head;
         Node nxt=head.next;
         S.add(curr.data);
         while(curr!=null && nxt!=null){
            if(S.contains(nxt.data)){
                Node n=nxt.next;
                curr.next=n;
                nxt=n;
            }else{
                curr=curr.next;
                nxt=nxt.next;
                S.add(curr.data);
            }     
         }
         return head;
    }
}
