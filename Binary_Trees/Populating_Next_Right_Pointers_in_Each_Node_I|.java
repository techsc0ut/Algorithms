class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int sz=Q.size();
            Node temp=new Node(-1);
            while(sz-->0){
                Node curr=Q.poll();
                temp.next=curr;
                temp=temp.next;
                if(curr.left!=null){
                    Q.add(curr.left);
                }
                if(curr.right!=null){
                    Q.add(curr.right);
                }
            }
        }return root;
    }
}
