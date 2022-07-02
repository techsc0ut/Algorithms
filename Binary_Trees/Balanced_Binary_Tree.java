/* O(n) Approach */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int depth = depth(root);
        return depth != -1;
    }
    
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = depth(root.left);
        if(leftDepth == -1){
            return -1;
        }
        int rightDepth = depth(root.right);
        if(rightDepth == -1){
            return -1;
        }
        if(Math.abs(leftDepth - rightDepth) > 1){
            return -1;
        }
        return Math.max(leftDepth,rightDepth)+1;
    }
}

/* O(n^2) */
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
