class Tree{
    int minValue(Node root){
        if(root==null){
            return -1;
        }
        if(root.right==null){
            return root.data;
        }
        return minValue(root.right);
    }
}

