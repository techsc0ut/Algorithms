class Solution{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K){
        ArrayList<Integer> A=new ArrayList<>();
        func(A,root);
        int n=A.size();
        if(K-1<A.size() && K-1>=0){
            return A.get(n-K);
        }return -1;
    }
    static void func(ArrayList<Integer> A,Node root){
        if(root==null){
            return;
        }func(A,root.left);
        A.add(root.data);
        func(A,root.right);
    }
}
