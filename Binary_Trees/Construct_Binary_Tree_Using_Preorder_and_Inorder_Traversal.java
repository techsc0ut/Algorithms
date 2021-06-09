class Solution{
    public static Node buildTree(int inorder[], int preorder[], int n){
        return helper(0,0,inorder.length-1,inorder,preorder);
    }
    static Node helper(int preStart,int inStart,int inend,int inorder[],int preorder[]){
        if(preStart>preorder.length-1 || inStart>inend){
            return null;
        }
        Node root=new Node(preorder[preStart]);
        int index=0;
        for(int i=inStart;i<=inend;i++){
            if(root.data==inorder[i]){
                index=i;
            }
        }
        root.left=helper(preStart+1,inStart,index-1,inorder,preorder);
        root.right=helper(preStart+index-inStart+1,index+1,inend,inorder,preorder);
        return root;
    }
}
