/* Also works if repeated node values are allowed */
class Solution {
    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ans=null;
        func(original,cloned,target);
        return ans;
    }
    public void func(TreeNode org, TreeNode cln, TreeNode target){
        if(org==null){
            return;
        }
        if(org==target){
            ans=cln;
            return;
        }
        func(org.left,cln.left,target);
        func(org.right,cln.right,target);
    }
}
