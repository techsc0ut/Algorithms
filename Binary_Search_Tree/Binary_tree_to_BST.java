class Solution{
    Node head=null;
    Node binaryTreeToBST(Node root){
        ArrayList<Integer> A=new ArrayList<>();
        func(A,root);
        Collections.sort(A);
        int i=1;
        Node head=new Node(A.get(0));
        while(i<A.size()){
            int a=A.get(i);
            insert(head,a);
            i++;
        }
        return head;
    }
    static void func(ArrayList<Integer> A,Node root){
        if(root==null){
            return;
        }
        func(A,root.left);
        A.add(root.data);
        func(A,root.right);
    }
    static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        if(root.data>x){
            root.left=insert(root.left,x);
        }else if(root.data<x){
            root.right=insert(root.right,x);
        }return root;
    }
}
 
