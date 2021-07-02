/* In all cases , Time Complexity is O(n^2) */
import java.io.*;
class GFG {
	public static void main (String[] args) {
		int ar[]={23,211234,-100,321,555};
		Selection_Sort(ar,ar.length);
		for(int x:ar){
		    System.out.print(x+" ");
		}
	}
	static void Selection_Sort(int ar[],int n){
	    for(int i=0;i<n;i++){
	        int index=i;
	        for(int j=i+1;j<n;j++){
	            if(ar[index]>ar[j]){
	                index=j;
	            }
	        }
	        int temp=ar[index];
	        ar[index]=ar[i];
	        ar[i]=temp;
	    }
	}
}
