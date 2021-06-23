public class Solution {
    public static boolean findPair(Node<Integer> head, int k) {
    	Node<Integer> curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        Node<Integer> Tail=curr;
        while(head!=Tail){
            int x=head.data+Tail.data;
            if(x==k){
                return true;
            }else if(x>k){
                Tail=Tail.prev;
            }else{
                head=head.next;
            }
        }return false;
    }
}
