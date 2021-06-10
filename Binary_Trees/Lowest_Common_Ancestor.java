class Solution{
	Node lca(Node root, int n1,int n2){
	    return func(root,n1,n2);
	}
	static Node func(Node root,int n1,int n2){
	    if(root==null){
	        return null;
	    }
	    if(root.data==n1 || root.data==n2){
	        return root;
	    }
	    Node lca1=func(root.left,n1,n2);
	    Node lca2=func(root.right,n1,n2);
	    if(lca1!=null && lca2!=null){
	        return root;
	    }
	    if(lca1!=null){
	        return lca1;
	    }
	    return lca2;
	}
}
