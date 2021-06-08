class Solution{
    static ArrayList <Integer> levelOrder(Node node){
        ArrayList<Integer> A=new ArrayList();
        Queue<Node> Q=new LinkedList();
        func(node,A,Q);
        return A;
    }
    static void func(Node node,ArrayList<Integer> A,Queue<Node> Q){
       Q.add(node);
       while(!Q.isEmpty()){
           Node p=Q.remove();
           A.add(p.data);
           if(p.left!=null){
               Q.add(p.left);
           }
           if(p.right!=null){
               Q.add(p.right);
           }
       }
       return ;
    }
}
