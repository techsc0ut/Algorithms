class Solution{
    static Node addTwoLists(Node first, Node second){
        if(first.next==null && second.next==null){
            int a=first.data+second.data;
            Node x=new Node(a);
            return x;
        }
        Node s1=rev(first),s2=rev(second);
        int carry=0;Node temp=s1;Node prev1=null,prev2=null;int flag=0;
        while(s1!=null && s2!=null){
            int a=s1.data+s2.data+carry;
            if(a>9){
                s1.data=a%10;
                carry=1;
                if(s1.next==null && s2.next==null){
                    flag=1;    
                }
            }else{
                s1.data=a;
                carry=0;
            }
            prev1=s1;
            prev2=s2;
            s1=s1.next;
            s2=s2.next;
        }
        if(flag==1){
            Node x=new Node(1);
            prev1.next=x;
        }
        if(s1!=null){
            while(s1!=null){
                int a=carry+s1.data;
                if(a>9){
                    if(s1.next==null){
                        s1.data=a%10;
                        Node x=new Node(1);
                        s1.next=x;
                        break;
                    }else{
                        s1.data=a%10;
                        carry=1;    
                    }
                }else{
                    s1.data=a;
                    carry=0;
                }
                s1=s1.next;
            }
        }
        if(s2!=null){
            prev1.next=s2;
            while(s2!=null){
                int a=carry+s2.data;
                if(a>9){
                    if(s2.next==null){
                        s2.data=a%10;
                        Node x=new Node(1);
                        s2.next=x;
                        break;
                    }else{
                        s2.data=a%10;
                        carry=1;    
                    }
                }else{
                    s2.data=a;
                    carry=0;
                }
                s2=s2.next;
            }
        }
        Node head=rev(temp);
        return head;
    }
    static Node rev(Node head){
        Node prev=null,nxt=null,curr=head;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}
