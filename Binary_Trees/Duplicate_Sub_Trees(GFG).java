class Solution{
    public List<Node> printAllDups(Node root){
        List<Node> L=new ArrayList<Node>();
        HashMap<String,Integer> H=new HashMap<>();
        func(root,L,H);
        //Collections.sort(L,new Comp());
        return L;
    }
    static String func(Node root,List<Node> L,HashMap<String,Integer> H){
        if(root==null){
            return "@";
        }
        String x="$"+func(root.left,L,H);
        String y="$"+func(root.right,L,H);
        String s=root.data+x+y;
        Integer xt=H.get(s);
        if(xt==null){
            xt=1;
            H.put(s,1);
        }else{
            H.put(s,xt+1);
        }
        if(H.get(s)==2){
            L.add(root);
        }return s;
    }
}
class Comp implements Comparator<Node>{
    public int compare(Node n1,Node n2){
        return n1.data-n2.data;
    }
}
