class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> S=new Stack();
        List<Integer> L=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null || !S.isEmpty()){
            while(curr!=null){
                L.add(curr.val);
                if(curr.right!=null){
                    S.push(curr.right);
                }
                curr=curr.left;
            }
            if(!S.isEmpty()){
                curr=S.pop();    
            }
        }
        return L;
    }
}
