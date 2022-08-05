/* Logic: 
    => Find the lowest common ancestor of the two nodes, and then calculate distance of both nodes from that node and add them 
*/
class GfG {
    
    int findDist(Node root, int a, int b) {
        Node lca=lowestCommonAncestor(root,a,b);
        return height(lca,a)+height(lca,b);
    }
    
    public int height(Node root, int x){
        if (root == null)
            return -1;

        int dist = -1;

        if ((root.data == x) ||
            (dist = height(root.left, x)) >= 0 ||
            (dist = height(root.right, x)) >= 0)
            return dist + 1;
 
        return dist;
    }
    
    public Node lowestCommonAncestor(Node root, int p, int q) {
        if(root==null) return null;
        
        if(root.data==p || root.data==q) return root;
        
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);
        
        if(left!=null && right!=null) return root;
        
        if(left!=null) return left;
        
        return right;
    }
    
}
