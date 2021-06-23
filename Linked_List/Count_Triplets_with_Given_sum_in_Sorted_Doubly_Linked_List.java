public class Solution {
    public static int countTriplets(DLLNode head,int x){
        if(head==null){
            return 0;
        }
        DLLNode end=head;
        while(end.next!=null){
            end=end.next;
        }
        int count=0;
        for(DLLNode curr=head;curr!=null;curr=curr.next){
            DLLNode first=curr.next;
            DLLNode second=end;
            count+=func(first,second,x-curr.data);
        }return count;
    }
    public static int func(DLLNode first,DLLNode second,int x){
        int count=0;
        while(first!=null && second!=null && first!=second && second.next!=first){
        	if(first.data+second.data==x){
            	count++;first=first.next;second=second.prev;
        	}else if(first.data+second.data>x){
                second=second.prev;
            }else{
                first=first.next;
            }    
        }return count;
    }
}
