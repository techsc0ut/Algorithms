class Solution{
     Stack<Integer> S=new Stack<>();
     static void Insert_at_Bottom(int x){
          if(S.isEmpty()){
               S.push(x);
          }else{
               int a=S.peek();
               S.pop();
               Insert_at_Bottom(x);
               S.push(a);
          }
     }
     static void reverse(){
          if(S.isEmpty()){
              return ;
          }
          else{
              int a=S.peek();
              S.pop();
              reverse();
              Insert_at_bottom(a);
          }
     }
}
