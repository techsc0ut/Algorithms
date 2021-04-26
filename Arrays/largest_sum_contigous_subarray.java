								// KADANE'S ALGORITHM
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
	int left=0;
	int right=0;
	int minus=-1;    
        for(int i=0;i<n;i++){
            cur+=arr[i];
            if(org<cur){
                org=cur;
		left=minus+1;
		right=i;
            }
            if(cur<0){
                cur=0;
		minus=i;    
            }
        }
        System.out.print(left+" "+right);      // Left and Right index of the Subarray .
        System.out.println("");
        return org;
    }
}

