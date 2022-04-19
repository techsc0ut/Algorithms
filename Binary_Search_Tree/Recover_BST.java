class Solution {
    static TreeNode prev;
    static TreeNode first;
    static TreeNode middle;
    static TreeNode second;
    public void recoverTree(TreeNode root) {
        prev=null;
        first=null;
        middle=null;
        second=null;
        func(root);
        if(second==null){
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }else{
            int temp=first.val;
            first.val=second.val;
            second.val=temp;
        }
        
    }
    public void func(TreeNode root){
        if(root==null){
            return;
        }
        func(root.left);
        if(prev==null){
            prev=root;
        }else{
            if(first==null && prev.val>root.val){
                first=prev;
                middle=root;
            }else if(second==null && prev.val>root.val){
                second=root;
            }
        }
        prev=root;
        func(root.right);
    }
}
