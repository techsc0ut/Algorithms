class GfG{
    static int count;
    public static int countPairs(Node root1, Node root2, int x){
        count=0;
        func(root1,root2,x);
        return count;
    }
    static void func(Node root,Node root2,int x){
        if(root==null){
            return ;
        }
        func(root.left,root2,x);
        func2(root.data,root2,x);
        func(root.right,root2,x);
    }
    static void func2(int x,Node root,int to){
        if(root==null){
            return;
        }
        if(root.data+x>to){
            func2(x,root.left,to);
        }
        else if(root.data+x<to){
            func2(x,root.right,to);
        }
        else{
            count++;
        }
    }
}
