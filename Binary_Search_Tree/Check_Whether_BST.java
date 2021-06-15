public class Solution{
    boolean isBST(Node root){
        return func(root).isBST;   
    }
    static temp func(Node root){
        if(root==null){
            return new temp(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
        }
        temp left=func(root.left);
        temp right=func(root.right);
        temp curr=new temp();
        if(left.isBST && right.isBST && root.data>left.max && root.data<right.min){
            curr.min=Math.min(root.data,Math.min(left.min,right.min));
            curr.max=Math.max(root.data,Math.max(left.max,right.max));
            curr.isBST=true;
        }else{
            curr=new temp(0,0,false);
        }return curr;
    }
}
class temp{
    int min,max;boolean isBST;
    temp(){}
    temp(int min,int max,boolean isBST){
        this.min=min;
        this.max=max;
        this.isBST=isBST;
    }
}
