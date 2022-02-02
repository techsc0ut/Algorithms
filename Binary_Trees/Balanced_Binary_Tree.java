class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(isBalanced(root.left) && isBalanced(root.right)){
            int left=height(root.left);
            int right=height(root.right);
            if(Math.abs(left-right)<=1){
                return true;
            }
        }
        return false;
    }
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return left>right?left+1:right+1;
    }
}
