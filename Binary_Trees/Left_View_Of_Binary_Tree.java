class Tree{
    ArrayList<Integer> leftView(Node root){
        TreeMap<Integer,Integer> T=new TreeMap<>();
        Queue<temp> Q=new LinkedList<>();
        Q.add(new temp(root,0));
        while(!Q.isEmpty()){
            temp t=Q.poll();
            Node n=t.n;
            int h=t.h;
            Integer a=T.get(h);
            if(n!=null && a==null){
                a=n.data;
                T.put(h,a);
            }
            if(n!=null && n.left!=null){
                Q.offer(new temp(n.left,h+1));
            }
            if(n!=null && n.right!=null){
                Q.offer(new temp(n.right,h+1));
            }
        }
        ArrayList<Integer> Res=new ArrayList<>();
        for(Integer x:T.values()){
            Res.add(x);
        }
        return Res;
    }
}
class temp{
    Node n;
    int h;
    temp(Node _n,int _h){
        this.n=_n;
        this.h=_h;
    }
}
