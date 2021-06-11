class Solution{
    static Node fat=null;
    static Node fat2=null;
    public void populateNext(Node root){
        fat=root;fat2=root;
        func(root);
    }
    static void func(Node root){
        if(root==null){
            return;
        }
        func(root.left);
        func1(root);
        func(root.right);
    }
    static void func1(Node x){
        Node to=x;
        if(fat==null || x==null){
            return ;
        }Node temp=null;
        while(fat!=null){
            if(fat.data<=x.data){
                fat=fat.right;
            }else{
                temp=fat;
                fat=fat.left;
            }
        }
        to.next=temp;
        fat=fat2;
        return;
    }
}
