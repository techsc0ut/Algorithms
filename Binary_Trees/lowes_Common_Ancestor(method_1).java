class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> A=new ArrayList<TreeNode>(),B=new ArrayList<TreeNode>();
        if(!func(root,p,A) || !func(root,q,B)){
            return new TreeNode(-101);
        }int i;
        for(i=0;i<A.size() && i<B.size();i++){
            if(A.get(i)!=B.get(i)){
                break;
            }
        }
        return A.get(i-1);
    }
    static boolean func(TreeNode root,TreeNode to,ArrayList<TreeNode> A){
        if(root==null){
            return false;
        }
        A.add(root);
        if(root==to){
            return true;
        }
        if(func(root.left,to,A) || func(root.right,to,A)){
            return true;
        }
        A.remove(root);
        return false;
    }
}
