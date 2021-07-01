class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        Node head=new Node(node.val);
        HashMap<Node,Node> H=new HashMap<>();
        H.put(node,head);
        Queue<Node> Q=new LinkedList<>();
        Q.add(node);
        while(!Q.isEmpty()){
            Node x=Q.remove();
            for(Node n:x.neighbors){
                if(!H.containsKey(n)){
                    H.put(n,new Node(n.val));
                    Q.add(n);
                }
                H.get(x).neighbors.add(H.get(n));
            }
        }return head;
    }
}
