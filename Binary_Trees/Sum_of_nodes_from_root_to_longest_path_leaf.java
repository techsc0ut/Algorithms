class Solution{
    public int sumOfLongRootToLeafPath(Node root){
       temp x=func(root);
       return x.s;
    }
    static temp func(Node root){
        if(root==null){
            return new temp(0,0);
        }
        temp a=func(root.left);
        temp b=func(root.right);
        if(a.h>b.h){
            return new temp(a.h+1,a.s+root.data);
        }else if(a.h<b.h){
            return new temp(b.h+1,b.s+root.data);
        }else{
            int x=Math.max(a.s,b.s);
            return new temp(a.h+1,x+root.data);
        }
    }
}
class temp{
    int h;
    int s;
    temp(int hh,int ss){
        this.h=hh;
        this.s=ss;
    }
}
