class Solution{
    //Function to reverse a linked list.
    Node reverseList(Node head){
        return rev(head,null);
    }
    Node rev(Node curr, Node prev){
        if(curr==null){
            return prev;
        }
        else{
            Node temp=curr.next;
            curr.next=prev;
            return rev(temp,curr);
        }
    }
}
