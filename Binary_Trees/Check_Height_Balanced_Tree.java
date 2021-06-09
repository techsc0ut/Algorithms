class Tree{
    boolean isBalanced(Node root){
	    if(root==null){
	        return true;
	    }      
	    boolean b1=isBalanced(root.left);
	    boolean b2=isBalanced(root.right);
	    int h1=height(root.left);
	    int h2=height(root.right);
	    int max=Math.max((h1-h2),(h2-h1));
	    if(b1 && b2 && max<=1){
	        return true;
	    }
	    return false;
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(1+height(root.left),1+height(root.right));
    }
}
