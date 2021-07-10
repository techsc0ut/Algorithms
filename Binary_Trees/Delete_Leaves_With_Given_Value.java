class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        root=func(root,target);
        return root;
    }
    static TreeNode func(TreeNode root,int target){
        if(root==null){
            return null;
        }
        root.left=func(root.left,target);
        root.right=func(root.right,target);
        if(root.left==null && root.right==null && root.val==target){
            root=null;
        }
        return root;
    }
}
