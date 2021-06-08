class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> A=new ArrayList();
        func(root,A);
        return A;
        
    }
    static void func(TreeNode root,List<Integer> A){
        if(root==null){
            return;
        }
        func(root.left,A);
        A.add(root.val);
        func(root.right,A);
    }
}
