class Tree{
    public ArrayList<Integer> diagonal(Node root){
        ArrayList<Integer> A=new ArrayList<>();
        TreeMap<Integer,ArrayList<Integer>> T=new TreeMap<>();
        func(root,T,0,0);
        for(ArrayList<Integer> At:T.values()){
            for(int p:At){
                A.add(p);
            }
        }return A;
    }
    static void func(Node root ,TreeMap<Integer,ArrayList<Integer>> T,int h,int l){
        if(root==null){
            return ;
        }
        ArrayList<Integer> A=T.get(h-l);
        if(A==null){
            A=new ArrayList<>();
            T.put(h-l,A);
        }
        A.add(root.data);
        func(root.left,T,h+1,l-1);
        func(root.right,T,h+1,l+1);
    }
}
class temp{
    Node n;
    int h;
    int l;
    temp(){}
    temp(Node nn,int hh,int ll){
        this.n=nn;
        this.h=hh;
        this.l=ll;
    }
}
