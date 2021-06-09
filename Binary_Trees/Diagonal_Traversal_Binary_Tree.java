class Tree{
    public ArrayList<Integer> diagonal(Node root){
        ArrayList<Integer> A=new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            Node curr=Q.remove();
            while(curr!=null){
                A.add(curr.data);
                if(curr.left!=null){
                    Q.add(curr.left);
                }
                curr=curr.right;
            }
        }
        return A;
    }
}
