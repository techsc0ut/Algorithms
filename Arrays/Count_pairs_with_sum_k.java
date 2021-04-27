import java.io.*;
import java.util.*;
public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
      int count=0;
      HashMap<Integer,Integer> H=new HashMap();
      for(int i=0;i<n;i++){
          int a=k-arr[i];
          Integer check=H.get(a);
          if(check!=null){
              count+=check;
          }
          Integer y=H.get(arr[i]);
          if(y!=null){
                H.put(arr[i],y+1);   
          }else{
              H.put(arr[i],1);
          }
      }
      return count;
    }
}

