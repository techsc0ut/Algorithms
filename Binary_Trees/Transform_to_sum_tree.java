class Solution{
    public void toSumTree(Node root){
       func(root,0);
       return;
    }
    static int func(Node root,int sum){
        if(root==null){
            return sum;
        }
        if(root.left!=null){
            sum+=root.left.data;
        }
        if(root.right!=null){
            sum+=root.right.data;
        }
        sum+=func(root.left,0)+func(root.right,0);
        root.data=sum;
        return sum;
    }
}
