class GfG{
    public static void findPreSuc(Node root, Res p, Res s, int key){
        if(root==null){
            return;
        }    
        if(root.data==key){
            if(root.left!=null){
                p.pre=func2(root.left);
            }
            if(root.right!=null){
                s.succ=func1(root.right);
            }
        }else if(root.data>key){
            s.succ=root;
            findPreSuc(root.left,p,s,key);
        }else {
            p.pre=root;
            findPreSuc(root.right,p,s,key);
        }
        return;
    }
    static Node func1(Node root){
        Node curr=root;
        while(curr.left!=null){
            curr=curr.left;
        }return curr;
    }
    static Node func2(Node root){
        Node curr=root;
        while(curr.right!=null){
            curr=curr.right;
        }return curr;
    }
}
