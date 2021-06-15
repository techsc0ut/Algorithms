class Tree{
    static int count;
    int getCount(Node root,int l, int h){
        count=0;func(root,l,h);return count;
    }
    static void func(Node root,int l,int h){
        if(root==null){
            return;
        }
        func(root.left,l,h);
        if(root.data>=l && root.data<=h){
            count++;
        }
        func(root.right,l,h);
    }
}
