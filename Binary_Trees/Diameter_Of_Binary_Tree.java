class Solution {
    int diameter(Node root) {
        if(root==null){
            return 0;
        }
        else{
            int a=Math.max(diameter(root.left),diameter(root.right));
            int max=height(root.left)+height(root.right)+1;
            return Math.max(a,max);
        }
    }
    static int height(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(1+height(node.left),1+height(node.right));
    }
}
