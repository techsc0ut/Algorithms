/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		    int x=sc.nextInt();
		    if(x==0){break;};
		    int ar1[]=new int[x];
		    for(int i=0;i<x;i++){ar1[i]=sc.nextInt();}
		    int y=sc.nextInt();
		    int ar2[]=new int[y];
		    for(int j=0;j<y;j++){ar2[j]=sc.nextInt();}
		    System.out.println(func(ar1,ar2));
		}
		
	}
	static int func(int ar1[],int ar2[]){
	    int s1=0,s2=0,res=0;
	    int i=0,j=0;
	    int n=ar1.length;
	    int m=ar2.length;
	    while(i<n && j<m){
	        if(ar1[i]<ar2[j]){
	            s1+=ar1[i++];
	        }else if(ar1[i]>ar2[j]){
	            s2+=ar2[j++];
	        }else{
	            res+=(Math.max(s1,s2)+ar1[i]);
	            s1=0;s2=0;i++;j++;
	        }
	    }while(i<n){
	        s1+=ar1[i++];
	    }while(j<m){
	        s2+=ar2[j++];
	    }
	    res+=Math.max(s1,s2);
	    return res;
	}
}
