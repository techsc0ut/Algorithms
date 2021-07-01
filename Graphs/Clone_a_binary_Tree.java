class Solution{
    public static Tree cloneTree(Tree tree){
        HashMap<Tree,Tree> H=new HashMap<>();
        populate(tree,H);
        Real(tree,H);
        return H.get(tree);
    }
    public static void populate(Tree tree,HashMap<Tree,Tree> H){
        if(tree==null){
            return;
        }
        populate(tree.left,H);
        H.put(tree,new Tree(tree.data));
        populate(tree.right,H);
    }
    public static void Real(Tree tree,HashMap<Tree,Tree> H){
        if(tree==null){
            return ;
        }
        Real(tree.left,H);
        Tree x=H.get(tree);
        x.left=H.get(tree.left);
        x.right=H.get(tree.right);
        x.random=H.get(tree.random);
        Real(tree.right,H);
    }
}
