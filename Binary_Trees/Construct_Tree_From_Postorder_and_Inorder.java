class GfG{
    static int idx;
    Node buildTree(int in[], int post[], int n) {
        idx=in.length-1;
        Node head=Build(0,n-1,in,post);
        return head;
    }
    static Node Build(int inStart,int inEnd,int in[],int post[]){
        if(inStart>inEnd){
            return null;
        }
        
        Node curr=new Node(post[idx--]);
        
        if(inStart==inEnd){
            return curr;
        }
        
        int index=-1;
        for(int i=inStart;i<=inEnd;i++){
            if(curr.data==in[i]){
                index=i;
                break;
            }
        }
        
        curr.right=Build(index+1,inEnd,in,post);
        curr.left=Build(inStart,index-1,in,post);
        return curr;
    }
}
