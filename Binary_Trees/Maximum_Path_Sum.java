class Solution {
    static int ans;
    public int maxPathSum(TreeNode root) {
        ans=Integer.MIN_VALUE;
        func(root);
        return ans;
    }
    static int func(TreeNode root){
        if(root==null){
            return 0;
        }        
        int left=func(root.left);
        int right=func(root.right);
        int mlr=Math.max(left,right);
        int case1=Math.max(root.val,root.val+mlr);// Straight Path where current node is included.
        int case2=Math.max(case1,root.val+left+right);// When current node is the root, so include both left, right and current.
        ans=Math.max(ans,case2);// Max So far
        return case1;
    }
}
