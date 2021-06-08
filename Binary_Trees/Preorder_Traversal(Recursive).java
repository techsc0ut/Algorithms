class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> A=new ArrayList();
        func(root,A);
        return A;
    }
    static void func(TreeNode root ,List<Integer> A){
        if(root==null){
            return ;
        }
        A.add(root.val);
        func(root.left,A);
        func(root.right,A);
    }
}
