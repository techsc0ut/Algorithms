// Approach is , we need 1st element of every Level .
class Tree{
    ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> A=new ArrayList<>();
        Queue<Node> Q=new LinkedList();
        func(A,Q,root);
        return A;
    }
    static void func(ArrayList<Integer> A,Queue<Node> Q,Node root){
        Q.add(root);
        while(!Q.isEmpty()){
            int n=Q.size();
            for(int i=1;i<=n;i++){
                Node a=Q.remove();
                if(i==1 && a!=null){
                    A.add(a.data);
                }
                if(a!=null && a.left!=null){
                    Q.add(a.left);
                }
                if(a!=null && a.right!=null){
                    Q.add(a.right);
                }
            }
        }
        return ;
    }
}
