import java.io.*;
import java.util.*;

class Solution
{
    public static void sort012(int a[], int n)
    {
        int low=0,mid=0,end=n-1;
        while(mid<=end){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;
            }else if(a[mid]==2){
                swap(a,mid,end);
                end--;
            }else{
                mid++;
            }
        }
    }
    public static void swap(int a[],int as,int b){
        int temp=a[as];
        a[as]=a[b];
        a[b]=temp;
    }
}
class GFG {  
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}
