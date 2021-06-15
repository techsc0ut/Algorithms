class Solution{
    static int largestBst(Node root){
        return func(root).size;
    }
    static temp func(Node root){
        if(root==null){
            return new temp(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        }
        temp left=func(root.left);
        temp right=func(root.right);
        temp curr=new temp();
        if(left.isBST && right.isBST && root.data>left.max && root.data<right.min){
            curr.min=Math.min(root.data,Math.min(left.min,right.min));
            curr.max=Math.max(root.data,Math.max(left.max,right.max));
            curr.isBST=true;
            curr.size=1+left.size+right.size;
        }else{
            curr=new temp(0,0,Math.max(left.size,right.size),false);
        }
        return curr;
    }
}

class temp{
  int min;
  int max;
  int size;
  boolean isBST;
  temp(){}
  temp(int min,int max,int size,boolean isBST){
      this.min=min;
      this.max=max;
      this.size=size;
      this.isBST=isBST;
  }
}
