/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;
         
        System.out.println("Element " + x +
                        " is present at index "
                        + search(arr, n, x, k));
	}
	static int search(int [] arr,int n,int x,int k){
	    int i=0;
	    while(i<n){
	        if(arr[i]==x){
	            return i;
	        }
	        i+=Math.max(1,Math.abs((arr[i]-x)/k));
	    }
	    return -1;
	}
}
