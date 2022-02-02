class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        func(root);
        return max;
    }
    int func(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=func(root.left);
        int right=func(root.right);
        max=Math.max(max,left+right);
        return left>right?left+1:right+1;
    }
}
