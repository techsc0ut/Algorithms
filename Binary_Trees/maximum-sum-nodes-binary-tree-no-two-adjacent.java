public static int func(Node node, HashMap<Node,Integer> H){
		if(node==null){
        	return 0;
        }
      	if(H.get(node)!=null){
        	return H.get(node);
        }
      	int inc=node.data;
      	if(node.left!=null){
        	inc+=func(node.left.left,H);
          	inc+=func(node.left.right,H);
        }
      	if(node.right!=null){
        	inc+=func(node.right.left,H);
          	inc+=func(node.right.right,H);
        }
      	int exc=func(node.right,H)+func(node.left,H);
      	int max=Math.max(exc,inc);
      	H.put(node,max);
      	return max;
	}
	public static int getMaxSum(Node node){
		if (node == null)
			return 0;
		HashMap<Node,Integer> H=new HashMap<>();
		return func(node, H);
	}
