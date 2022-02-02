class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> Res=new ArrayList<>();
        if(root==null){
            return Res;
        }
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        int ind=0;
        while(!Q.isEmpty()){
            List<Integer> Lst=new ArrayList<>();
            int size=Q.size();
            for(int i=0;i<size;i++){
                TreeNode t=Q.poll();
                Lst.add(t.val);
                if(t.left!=null){
                    Q.add(t.left);
                }
                if(t.right!=null){
                    Q.add(t.right);
                }
            }
            if(ind%2==1){
                Collections.reverse(Lst);
            }
            ind++;
            Res.add(Lst);
        }return Res;
    }
}
