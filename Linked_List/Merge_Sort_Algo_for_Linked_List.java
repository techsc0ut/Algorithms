class Solution{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head){
        if(head.next==null){
            return head;
        }
        Node mid=FindMid(head);
        Node midnext=mid.next;
        mid.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(midnext);
        Node f=Merge(left,right);
        return f;
    }
  
    /* THIS IS IMPORTANT PART , HERE WE ARE INITIALIIZING FAST WITH NEXT OF HEAD ELEMENT , WHICH IS NOT IN CASE OF FINDING THE MIDDLE ELEMENT OF LIST , SINCE WE INITIALIZE THEIR
       WITH JUST HEAD */
    static Node FindMid(Node head){
        if(head==null){
            return head;
        }
        Node slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;slow=slow.next;
        }return slow;
    }
    static Node Merge(Node left,Node right){
        Node temp=new Node(1);Node x=temp;
        while(left!=null && right!=null){
            if(left.data>right.data){
                x.next=right;
                right=right.next;
            }else if(left.data<=right.data){
                x.next=left;
                left=left.next;
            }
            x=x.next;
        }
        if(left!=null){
            x.next=left;
        }
        if(right!=null){
            x.next=right;
        }
        return temp.next;
    }
}
