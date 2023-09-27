class Solution  {
    
    ArrayList<Integer> res;
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       
       res = new ArrayList<>();
       
       helper(0, 0, arr, N);
       
       return res;
    
    }
    
    public void helper(int idx, int curSum, ArrayList<Integer> arr, int N){

        // If we are done with all manipulation in selection and rejection of all elements
        if(idx == N){
            
            res.add(curSum);
            return;
            
        }

        // If we select current element to be in subset
        helper(idx + 1, curSum + arr.get(idx), arr, N);

        // If we don't select the current element in subset
        helper(idx + 1, curSum, arr, N);
        
    }
    
}
