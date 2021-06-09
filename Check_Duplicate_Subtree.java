class Solution {
    int dupSub(Node root) {
        HashMap<String,Integer> H=new HashMap<>();
        func(root,H);
        for(int x:H.values()){
            if(x>=2){
                return 1;
            }
        }return 0;
    }
    static String func(Node root,HashMap<String,Integer> H){
        if(root==null){
            return "$";
        }
        String s;
        if(root.left==null && root.right==null){
            s=root.data+"";
            return s;
        }
        s=root.data+"";
        s+=func(root.left,H);
        s+=func(root.right,H);
        Integer a=H.get(s);
        if(a==null){
            a=1;
            H.put(s,a);
        }else{
            H.put(s,a+1);
        }
        return s;
    }
}
