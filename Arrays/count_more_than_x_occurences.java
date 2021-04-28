class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        HashMap<Integer,Integer> H=new HashMap();
        int h=n/k;
        ArrayList<Integer> A=new ArrayList();
        for(int i=0;i<n;i++){
            Integer x=H.get(arr[i]);
            if(x!=null){
                if(x>h){
                     if(!A.contains(arr[i])){
                        A.add(arr[i]);   
                     }
                }else{
                    x=x+1;
                    if(x>h){
                        A.add(arr[i]);   
                    }
                    H.put(arr[i],x);
                }
            }else{
                H.put(arr[i],1);
            }
        }
        return A.size();
    }
}
