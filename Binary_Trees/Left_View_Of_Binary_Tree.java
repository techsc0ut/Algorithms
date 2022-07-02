class Tree{
    ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> Res=new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            int sz=Q.size();
            for(int i=0;i<sz;i++){
                Node tmp=Q.poll();
                if(i==0 && tmp!=null){
                    Res.add(tmp.data);
                }
                if(tmp!=null && tmp.left!=null){
                    Q.offer(tmp.left);
                }
                if(tmp!=null && tmp.right!=null){
                    Q.offer(tmp.right);
                }
            }
        }return Res;
    }
}
