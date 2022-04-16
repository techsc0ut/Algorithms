class Solution {
    static int sum;
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        return func(root);
    }
    public TreeNode func(TreeNode root){
        if(root==null){
            return null;
        }
        func(root.right);
        root.val+=sum;
        sum=root.val;
        func(root.left);
        return root;
    }
}
