class Solution{
    public static long[] nextLargerElement(long[] arr,int n){ 
        Stack<Long> s = new Stack<>();              
        long nge[] = new long[n]; 
        for (int i=n-1;i>=0;i--){     
            if(!s.empty()){              
                while (!s.empty() && s.peek() < arr[i]) {
                    s.pop();                              
                } 
            } 
            nge[i]=s.empty()?-1:s.peek();  
            s.push(arr[i]);                     
        } 
        return nge;
    } 
}
