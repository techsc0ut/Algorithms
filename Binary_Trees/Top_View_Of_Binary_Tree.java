class Solution{
    static ArrayList<Integer> topView(Node root){
        TreeMap<Integer,Integer> Ar=new TreeMap<>();
        Queue<temp> Q=new LinkedList<>();
        Q.add(new temp(root,0));
        while(!Q.isEmpty()){
            temp t=Q.poll();
            Node n=t.n;
            int l=t.l;
            Integer a=Ar.get(l);
            if(a==null){
                a=n.data;
                Ar.put(l,a);
            }
            if(n.left!=null){
                Q.offer(new temp(n.left,l-1));
            }
            if(n.right!=null){
                Q.offer(new temp(n.right,l+1));
            }
        }
        ArrayList<Integer> Res=new ArrayList<>();
        for(Integer x: Ar.values()){
            Res.add(x);
        }
        return Res;
    }
}
class temp{
    Node n;
    int l;
    temp(Node _n,int _l){
        this.n=_n;
        this.l=_l;
    }
}
