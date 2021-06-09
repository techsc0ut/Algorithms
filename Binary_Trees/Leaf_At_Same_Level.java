class Solution{
    boolean check(Node root){
	    if(root==null)return true;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node curr=q.poll();
                if(curr.left==null&&curr.right==null)
                hm.put(level,curr.data);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
            level++;
        }
        if(hm.size()==1)
        return true;
        else
        return false;
    }
}
