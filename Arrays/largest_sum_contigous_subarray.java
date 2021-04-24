import java.io.*;

class Main {
   public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}
class Solution{

    int maxSubarraySum(int arr[], int n){
        int org=Integer.MIN_VALUE;
        int cur=0;
        for(int i=0;i<n;i++){
            cur+=arr[i];
            if(org<cur){
                org=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return org;
    }
}

