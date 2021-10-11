class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> Res=new ArrayList<>();
        func(0,arr,Res,0);
        return Res;
    }
    static void func(int i,ArrayList<Integer> arr,ArrayList<Integer> Res,int sum){
          if(i>=arr.size()){
              Res.add(sum);
              return;
          }
          func(i+1,arr,Res,sum);
          func(i+1,arr,Res,sum+arr.get(i));
    }
}
