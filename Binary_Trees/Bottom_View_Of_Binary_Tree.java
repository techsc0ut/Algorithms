class Tree{
    public ArrayList <Integer> bottomView(Node root){
        ArrayList<Integer> A=new ArrayList<>();
        TreeMap<Integer,Integer> T=new TreeMap<>();
        Queue<temp> Q=new LinkedList<>();
        Q.add(new temp(root,0));
        while(!Q.isEmpty()){
            temp x=Q.remove();
            Node c=x.n;
            int L=x.l;
            T.put(L,c.data);
            if(c.left!=null){
                Q.add(new temp(c.left,L-1));
            }
            if(c.right!=null){
                Q.add(new temp(c.right,L+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:T.entrySet()){
            A.add(entry.getValue());
        }return A;
    }
    
}
class temp{
    Node n;
    int l;
    temp(){}
    temp(Node nn,int ll){
        this.n=nn;
        this.l=ll;
    }
}
