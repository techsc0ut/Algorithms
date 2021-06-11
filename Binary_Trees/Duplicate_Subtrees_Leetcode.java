class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> L=new ArrayList<TreeNode>();
        HashMap<String,Integer> H=new HashMap<>();
        func(L,root,H);
        Collections.sort(L,new comp());
        return L;
    }
    static String func(List<TreeNode> L,TreeNode root,HashMap<String,Integer> H){
        if(root==null){
            return "$";
        }
        String x="$"+func(L,root.left,H);
        String y="$"+func(L,root.right,H);
        String s=root.val+x+y;
        Integer xt=H.get(s);
        if(xt==null){
            xt=1;
            H.put(s,1);
        }else{
            H.put(s,xt+1);
        }
        if(H.get(s)==2){
            L.add(root);
        }return s;
    }
}
class comp implements Comparator<TreeNode>{
    public int compare(TreeNode n1,TreeNode n2){
        return n1.val-n2.val;
    }
}
