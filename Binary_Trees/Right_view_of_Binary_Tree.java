class Solution{
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> A=new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        func(A,Q,node);
        return A;
    }
    static void func(ArrayList<Integer> A,Queue<Node> Q,Node root){
        Q.add(root);
        while(!Q.isEmpty()){
            int n=Q.size();
            for(int i=0;i<n;i++){
                Node x=Q.remove();
                if(x!=null && i==0){
                    A.add(x.data);
                }
                if(x!=null && x.right!=null){
                    Q.add(x.right);
                }
                if(x!=null && x.left!=null){
                    Q.add(x.left);
                }
            }
        }
        return;
   
