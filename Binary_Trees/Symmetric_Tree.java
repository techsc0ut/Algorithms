/* RECURSIVE */
class Solution {
   public boolean isSymmetric(TreeNode root) {
    return root==null || isSymmetricHelp(root.left, root.right);
}

private boolean isSymmetricHelp(TreeNode left, TreeNode right){
    if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
}
}

/* ITERATIVE */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root.left);
        Q.offer(root.right); 
        
        while(!Q.isEmpty()){
            TreeNode left=Q.poll();
            TreeNode right=Q.poll();
            if(left==null && right==null){
                continue;
            }
            if(left==null || right==null || left.val!=right.val){
                return false;
            }
            Q.offer(left.left);
            Q.offer(right.right);
            Q.offer(left.right);
            Q.offer(right.left);
        }
        
        return true;
    }
}
