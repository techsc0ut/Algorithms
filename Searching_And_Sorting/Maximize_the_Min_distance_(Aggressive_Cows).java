/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int c=sc.nextInt();
		    int ar[]=new int[n];
		    for(int j=0;j<n;j++){
		        ar[j]=sc.nextInt();
		    }
		    int res=Min_Max(ar,ar.length,c);
		    System.out.println(res);
		}
	}
	static boolean IsPossible(int ar[],int C,int x){
	   int cows=1;
	   int n=ar.length;
	   int pos=ar[0];
	   for(int i=1;i<n;i++){
	       if(ar[i]-pos>=x){
	           cows++;
	           pos=ar[i];
	           if(cows==C){
	               return true;
	           }
	       }
	   }
	   return false;
	}
	static int Min_Max(int ar[],int N,int C){
	    Arrays.sort(ar);
	    int start=ar[0];
	    int end=ar[N-1]-ar[0];
	    int ans=Integer.MIN_VALUE;
	    while(start<end){
	        int mid=(start+end)/2;
	        if(IsPossible(ar,C,mid)){
	            ans=Math.max(ans,mid);
	            start=mid+1;
	        }else{
	            end=mid;
	        }
	    }
	    return ans;
	}
}
