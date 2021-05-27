/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
	public static void main (String[] args) {
	    int ar1[]={1,81,100,122};
	    int ar2[]={78,90,91};
	    Merge(ar1,ar2);
	    for(int x:ar1){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	    for(int y:ar2){
	        System.out.print(y+" ");
	    }
	}
	static void Merge(int ar1[],int ar2[]){
	    int org=ar1.length+ar2.length;
	    int gap=nextGap(org);
	    while(gap!=0){
	        int i=0,j=gap;
	        while(i<org && j<org){
	            if(i<ar1.length && j<ar1.length){
	                if(ar1[i]>ar1[j]){
	                    swap(ar1,i,ar1,j);
	                    i++;j++;
	                }else{
	                    i++;j++;
	                }
	            }else if(i<ar1.length && j>=ar1.length && j<org){
	                int ind=j-ar1.length;
	                if(ar1[i]>ar2[ind]){
	                    swap(ar1,i,ar2,ind);
	                    i++;j++;
	                }else{
	                    i++;j++;
	                }
	            }else if(i>=ar1.length && j>=ar1.length && i<org && j<org){
	                int ind1=i-ar1.length,ind2=j-ar1.length;
	                if(ar2[ind1]>ar2[ind2]){
	                    swap(ar2,ind1,ar2,ind2);
	                    i++;
	                    j++;
	                }else{
	                    i++;j++;
	                }
	            }else{
	                break;
	            }
	        }
	        gap=nextGap(gap);
	    }
	}
	static void swap(int ar1[],int a,int ar2[],int b){
	    int temp=ar1[a];
	    ar1[a]=ar2[b];
	    ar2[b]=temp;
	}
}
