class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Lst=new ArrayList<>();
        if(root==null){
            return Lst;
        }
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            List<Integer> L=new ArrayList<>();
            int size=Q.size();
            for(int i=0;i<size;i++){
                TreeNode n=Q.poll();
                L.add(n.val);
                if(n.left!=null){
                    Q.add(n.left);
                }
                if(n.right!=null){
                    Q.add(n.right);
                }
            }
            Lst.add(L);
        }return Lst;
    }
}
