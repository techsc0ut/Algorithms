class Solution{
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> A=new ArrayList<>();
        TreeMap<Integer,Integer> T=new TreeMap<Integer,Integer>();
        Queue<temp> Q=new LinkedList<>();
        Q.add(new temp(root,0));
        while(!Q.isEmpty()){
            temp x=Q.remove();
            Node c=x.n;
            int h=x.L;
            if(T.get(h)==null){
                T.put(h,c.data);
            }
            if(c.left!=null){
                Q.add(new temp(c.left,h-1));
            }
            if(c.right!=null){
                Q.add(new temp(c.right,h+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry : T.entrySet()) {
            Integer value = entry.getValue();
            A.add(value);
        }
        return A;
    }
}
class temp{
    Node n;
    int L;
    temp(){}
    temp(Node nn,int LL){
        this.n=nn;
        this.L=LL;
    }
}
