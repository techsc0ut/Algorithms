class Solution{
    public void connect(Node root){
        Queue<Node> Q=new LinkedList<>(); 
        Q.offer(root);
        while(!Q.isEmpty()){
            int size=Q.size();
            Node temp=new Node(-1);
            while(size-->0){
                Node curr=Q.poll();
                temp.nextRight=curr;
                temp=temp.nextRight;
                if(curr!=null && curr.left!=null){
                    Q.offer(curr.left);
                }
                if(curr!=null && curr.right!=null){
                    Q.offer(curr.right);
                }
            }
        }
    }
}
