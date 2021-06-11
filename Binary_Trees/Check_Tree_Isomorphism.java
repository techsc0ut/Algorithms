class Solution  { 
    boolean isIsomorphic(Node root1, Node root2){ 
        return func(root1,root2);
    }
    static boolean func(Node r1,Node r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.data!=r2.data){
            return false;
        }
        boolean b1=func(r1.left,r2.left) && func(r1.right,r2.right);
        boolean b2=func(r1.left,r2.right) && func(r1.left,r2.right);
        return b1 || b2;
    }
}    
