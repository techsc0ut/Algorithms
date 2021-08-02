class Solution {
    int diameter(Node root) {
        if(root==null){
            return 0;
        }
        A a=new A();
        height(root,a);
        return a.ans;
       
    }
    int height(Node root, A a){
        if(root==null){
            return 0;
        }
        int left=height(root.left,a);
        int right=height(root.right,a);
        a.ans=Math.max(a.ans,left+right+1);
        return 1+Math.max(left,right);
    }
}
class A{
    int ans=Integer.MIN_VALUE;
}
