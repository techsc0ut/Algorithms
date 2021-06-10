class Solution {
    void mirror(Node node) {
        func(node);
        return;
    }
    static Node func(Node node){
        if(node==null){
            return null;
        }
        func(node.left);
        func(node.right);
        Node t=node.left;
        node.left=node.right;
        node.right=t;
        return node;
    }
}
