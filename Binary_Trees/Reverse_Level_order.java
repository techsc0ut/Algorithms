class Tree{
    public ArrayList<Integer> reverseLevelOrder(Node node){
        Stack<Node> S = new Stack();
        Queue<Node> Q = new LinkedList();
        return func(node,S,Q);
    }
    static ArrayList<Integer> func(Node node,Stack<Node> S,Queue<Node> Q){
        Q.add(node);
        ArrayList<Integer> A=new ArrayList();
        while (!Q.isEmpty()){
            Node n=Q.remove();
            S.push(n);
            if (n.right != null){
                Q.add(n.right);    
            }
            if (n.left != null){
                Q.add(n.left);    
            }
        }
        while (!S.empty()){
            A.add(S.pop().data);
        }
        return A;
    }
    
} 
