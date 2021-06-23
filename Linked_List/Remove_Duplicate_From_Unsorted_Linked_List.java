class Solution{
    public Node removeDuplicates(Node head){
        HashSet<Integer> H=new HashSet<>();
        Node curr=head,prev=null;
        while(curr!=null){
            if(H.contains(curr.data)){
               prev.next=curr.next;
               curr=curr.next;
            }else{
               prev=curr;
               H.add(curr.data);
               curr=curr.next;
            }
        }return head;
    }
}
