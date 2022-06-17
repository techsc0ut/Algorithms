class Solution {
    Set<TreeNode> Covered;
    int cam;
    public int minCameraCover(TreeNode root) {
        if (root==null) return 0;
        Covered=new HashSet<>();
        cam=0;
        Covered.add(null);
        DFS(root,null);
        return cam;
    }
    public void DFS(TreeNode root, TreeNode parent){
        if(root!=null){
            DFS(root.left,root);
            DFS(root.right,root);
            if((parent==null && !Covered.contains(root)) || !Covered.contains(root.left) || !Covered.contains(root.right)){
                cam++;
                Covered.add(root);
                Covered.add(parent);
                Covered.add(root.left);
                Covered.add(root.right);
            }
        }
    }
}
