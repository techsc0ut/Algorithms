class Solution{
    static Node temp=new Node(-1);
    Node bToDLL(Node root){
        Node x=temp;
        func(root);
        Node head=x.right;
        head.left=null;
        return head;
    }
    static void func(Node root){
        if(root==null){
            return;
        }
        func(root.left);
        temp.right=root;
        root.left=temp;
        temp=temp.right;
        func(root.right);
    }
}
