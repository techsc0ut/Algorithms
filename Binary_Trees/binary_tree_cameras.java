/* Approach 1: O(N) Time and O(N) Space */
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

/* Approach 2: O(N) Time and O(N) Space */
class Solution {
    int cam;
    public int minCameraCover(TreeNode root) {
        cam=0;
        int ans=DFS(root);
        return ans==0?cam+1:cam;
    }
    /*
    1 --> Covered
    2 --> Has Camera
    0 --> Not Covered
    */
    public int DFS(TreeNode root){
        if(root==null) return 1;
        int left=DFS(root.left);
        int right=DFS(root.right);
        if(left==0 || right==0){
            cam++;
            return 2;
        }else if(left==2 || right==2){
            return 1;
        }else return 0;
    }
}
