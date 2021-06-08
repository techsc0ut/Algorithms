class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> L=new ArrayList();
        func(root,L);
        return L;
    }
    static void func(TreeNode root,List<Integer> L){
        if(root==null){
            return;
        }
        func(root.left,L);
        func(root.right,L);
        L.add(root.val);
    }
}
