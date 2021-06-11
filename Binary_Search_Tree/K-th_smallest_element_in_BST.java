class Solution{
    public int KthSmallestElement(Node root, int K){
        ArrayList<Integer> A= new ArrayList<>();
        func(root,A);
        if(K-1<A.size() && K-1>=0){
            return A.get(K-1);    
        }return -1;
    }
    static void func(Node root,ArrayList<Integer> A){
        if(root==null){
            return;
        }func(root.left,A);
        A.add(root.data);
        func(root.right,A);
    }
}
