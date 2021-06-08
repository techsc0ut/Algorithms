class GFG{
	    ArrayList<Integer> zigZagTraversal(Node root){
	    ArrayList<Integer> A=new ArrayList<>();
	    TreeMap<Integer,ArrayList<Integer>> T=new TreeMap<>();
	    Queue<temp> Q=new LinkedList<>();
	    Q.add(new temp(root,0));
	    while(!Q.isEmpty()){
	        temp x=Q.remove();
	        Node c=x.r;
	        int H=x.h;
	        ArrayList<Integer> At=T.get(H);
	        if(At==null){
	            At=new ArrayList<Integer>();
	            At.add(c.data);
	            T.put(H,At);
	        }
	        else{
	            At.add(c.data);
	        }
	        if(c.left!=null){
	            Q.add(new temp(c.left,H+1));
	        }
	        if(c.right!=null){
	            Q.add(new temp(c.right,H+1));
	        }
	    }
	    int i=0;
	    for(ArrayList<Integer> t:T.values()){
	        if(i%2==0){
	            for(int x:t){
	                A.add(x);
	            }
	        }else{
	            Collections.reverse(t);
	             for(int x:t){
	                A.add(x);
	            }
	        }
	        i++;
	    }
	    return A;
	}
	
}
class temp{
    Node r;
    int h;
    temp(){}
    temp(Node rr,int hh){
        this.r=rr;
        this.h=hh;
    }
}
