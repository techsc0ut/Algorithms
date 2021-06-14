class GfG {
    int findDist(Node root, int a, int b) {
        ArrayList<Node> A=new ArrayList<Node>(),B=new ArrayList<Node>();
        func(root,a,A);
        func(root,b,B);
        int i;
        for(i=0;i<A.size() && i<B.size();i++){
            if(A.get(i)!=B.get(i)){
                break;
            }
        }
        int c1=0,c2=0;
        int x1=i-1
        c1=A.size()-x1-1;c2=B.size()-x1-1;
        return c1+c2;
    }
    static boolean func(Node root,int n,ArrayList<Node> A){
        if(root==null){
            return false;
        }
        A.add(root);
        if(root.data==n){
            return true;
        }
        if(func(root.left,n,A) || func(root.right,n,A)){
            return true;
        }
        A.remove(root);
        return false;
    }
}
