class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> Lst=new ArrayList<>();
        Stack<TreeNode> S1=new Stack<>();
        Stack<TreeNode> S2=new Stack<>();
        S1.push(root);
        TreeNode curr=null;
        while(!S1.isEmpty()){
            curr=S1.pop();
            S2.push(curr);
            if(curr!=null && curr.left!=null){
                S1.push(curr.left);
            }
            if(curr!=null && curr.right!=null){
                S1.push(curr.right);
            }
        }
        while(!S2.isEmpty()){
            curr=S2.pop();
            if(curr!=null){
                Lst.add(curr.val);    
            }
        }return Lst;
    }
}
