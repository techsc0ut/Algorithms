class GFG{
    static boolean IsDead;
    public static boolean isDeadEnd(Node root){
        IsDead=false;
        java.util.HashSet<Integer> H=new java.util.HashSet<>();
        func(root,H);
        return IsDead;
    }
    static void func(Node root,java.util.HashSet<Integer> H){
        if(root==null){
            return ;
        }
        int val=root.data;
        if(val==1){
            if(H.contains(val+1)){
                IsDead=true;
                return;
            }
        }
        if(H.contains(val-1) && H.contains(val+1)){
            IsDead=true;
            return;
        }
        H.add(val);
        func(root.left,H);
        if(!IsDead){
            func(root.right,H);
        }
    }
}
