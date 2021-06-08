class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> L=new ArrayList<>();
        Stack<TreeNode> S=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !S.isEmpty()){
            while(curr!=null){
                S.push(curr);
                curr=curr.left;
            }
            curr=S.pop();
            L.add(curr.val);
            curr=curr.right;
        }
        return L;
    }
}
