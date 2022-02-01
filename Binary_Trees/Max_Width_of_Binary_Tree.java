class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }        
        int width=0;
        Queue<temp> Q=new LinkedList<>();
        Q.add(new temp(root,0));
        while(!Q.isEmpty()){
            int size=Q.size();
            int max_index=0;
            int min_index=0;
            for(int i=0;i<size;i++){
                temp t=Q.poll();
                TreeNode n=t.root;
                int ind=t.l;
                if(i==0){
                    min_index=ind;
                }
                if(i==size-1){
                    max_index=ind;
                }
                if(n.left!=null){
                    Q.offer(new temp(n.left,2*ind));
                }
                if(n.right!=null){
                    Q.offer(new temp(n.right,2*ind+1));
                }
            }
            width=Math.max(width,max_index-min_index+1);
        }
        return width;
    }
}
class temp{
    TreeNode root;
    int l;
    temp(TreeNode _root, int _l){
        this.root=_root;
        this.l=_l;
    }
}
