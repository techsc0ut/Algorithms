class Solution{
	ArrayList <Integer> printBoundary(Node node){
	    ArrayList<Integer> A=new ArrayList<>();
	    HashMap<Node,Boolean> H=new HashMap<>();
	    Queue<Node> Q=new LinkedList<>();
	    A.add(node.data);
	    H.put(node,true);
	    Q.add(node.left);
	    leftview(Q,A,H);
	    func(A,node,H);
	    ArrayList<Integer> P=new ArrayList<>();
	    Q.add(node.right);
	    rightview(Q,P,H);
	    for(int x:P){
	        A.add(x);
	    }
	    return A;
	}
	static void func(ArrayList<Integer> A,Node root,HashMap<Node,Boolean> H){
	    if(root==null){
	        return ;
	    }
	    if(root.left==null && root.right==null && H.get(root)==null){
	        A.add(root.data);
	        H.put(root,true);
	    }
	    func(A,root.left,H);
	    func(A,root.right,H);
	}
	static void leftview(Queue<Node> Q,ArrayList<Integer> A,HashMap<Node,Boolean> H){
	    while(!Q.isEmpty()){
	        int n=Q.size();
	        for(int i=0;i<n;i++){
	            Node x=Q.remove();
	            if(i==0 && x!=null){
	                A.add(x.data);
	                H.put(x,true);
	            }
	            if(x!=null && x.left!=null){
	                Q.add(x.left);
	            }
	            if(x!=null && x.right!=null){
	                Q.add(x.right);
	            }
	        }
	    }    
	}
	static void rightview(Queue<Node> Q,ArrayList<Integer> P,HashMap<Node,Boolean> H){
	    while(!Q.isEmpty()){
	        int n=Q.size();
	        for(int i=0;i<n;i++){
	            Node x=Q.remove();
	            if(i==0 && x!=null && (H.get(x)==null)){
	                P.add(x.data);
	            }
	            if(x!=null && x.right!=null){
	                Q.add(x.right);
	            }
	            if(x!=null && x.left!=null){
	                Q.add(x.left);
	            }
	        }
	    }
	    Collections.reverse(P);
	}
}
