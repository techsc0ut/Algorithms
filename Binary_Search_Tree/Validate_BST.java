class Solution {
    
    boolean ans;
    TreeNode prev;
    
    public boolean isValidBST(TreeNode root) {
        
        prev=null;
        ans=true;
        inOrder(root);
        return ans;   
    }
    
    public void inOrder(TreeNode root){
        if(root==null) return;
        
        inOrder(root.left);
        
        if(prev!=null && root.val<=prev.val){
            ans=false;
            return;
        }
        
        prev=root;
        
        inOrder(root.right);
    }  
    
}
