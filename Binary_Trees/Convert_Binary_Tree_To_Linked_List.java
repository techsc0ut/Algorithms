/*
Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 
*/
class Solution {
    static TreeNode prev;
    public void flatten(TreeNode root) {
        prev=new TreeNode(-1);
        TreeNode temp=prev;
        Preorder(root);
        root=temp.right;
    }
    static void Preorder(TreeNode root){
        if(root==null){
            return ;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        func(root);
        Preorder(left);
        Preorder(right);
    }
    static void func(TreeNode root){
        prev.right=root;
        prev=prev.right;
        prev.left=null;
    }
}
