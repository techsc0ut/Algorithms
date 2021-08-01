class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p==null && q!=null){
            return false;
        }else if(p!=null && q==null){
            return false;
        }
        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);
        if(left && right && p.val==q.val){
            return true;
        }
        return false;
    }
}
