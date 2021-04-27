class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {   
        ArrayList<Integer> R=new ArrayList<>();
        HashMap<Integer,Integer> H=new HashMap<>();
        for(int i=0;i<n1;i++){
            H.put(A[i],1);
        }
        for(int j=0;j<n2;j++){
            Integer x=H.get(B[j]);
            if(x!=null){
                H.put(B[j],x+1);
            }
        }
        for(int k=0;k<n3;k++){
            Integer y=H.get(C[k]);
            if(y!=null){
                if(y>=2){
                    if(!R.contains(C[k])){
                        R.add(C[k]);   
                    }
                }
            }
        }
        if(R.size()==0){
            R.add(-1);
        }
        return R;
    }
}
