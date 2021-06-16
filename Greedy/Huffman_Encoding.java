class Solution {
    public ArrayList<String> huffmanCodes(String S, int f[], int N){
        PriorityQueue<temp> P=new PriorityQueue<temp>(new comp());
        for(int i=0;i<N;i++){
            P.add(new temp(S.charAt(i),f[i]));
        }
        temp root=new temp(-1);
        while(P.size()>1){
            temp x=P.poll();
            temp y=P.poll();
            temp z=new temp(x.data+y.data);
            z.left=x;z.right=y;
            P.add(z);
            root=z;
        }
        ArrayList<String> A=new ArrayList<String>();
        func(root,A,"");
        return A;
    }
    static void func(temp root,ArrayList<String> A,String s){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            A.add(s);
        }
        func(root.left,A,s+"0");
        func(root.right,A,s+"1");
    }
}
class temp{
    char a;
    int data;
    temp left;
    temp right;
    temp(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    temp(char a,int data){
        this.a=a;
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class comp implements Comparator<temp>{
    public int compare(temp t1,temp t2){
        if(t1.data >= t2.data){
            return 1;
        }
        else{
            return -1;
        }
    }
}
