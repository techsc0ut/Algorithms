class Solution {
    int height(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(1+height(node.left),1+height(node.right));
    }
}
