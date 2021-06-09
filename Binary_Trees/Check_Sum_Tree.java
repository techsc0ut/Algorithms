class Solution{
	boolean isSumTree(Node root){
        HashMap<Node,Integer> H=new HashMap<>();
        Check(root,0,H);
        for(Map.Entry<Node,Integer> entry : H.entrySet()) {
            Node x=entry.getKey();
            if(x.data!=entry.getValue()){
                return false;
            }
        }
        return true;
	}
	static int Check(Node root,int sum,HashMap<Node,Integer> H){
	    if(root==null){
	        return sum;
	    }
	    if(root.left!=null){
	        sum+=root.left.data;
	    }
	    if(root.right!=null){
	        sum+=root.right.data;
	    }
	    sum+=Check(root.left,0,H)+Check(root.right,0,H);
	    if(root.left!=null && root.right!=null){
	        H.put(root,sum);    
	    }else{
	        H.put(root,root.data);
	    }
	    return sum;
	}
}
