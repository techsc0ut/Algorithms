import java.util.*;
import java.lang.*;
import java.io.*;

public class Job_Scheduling {
	public static void main(String[] args) {
		int w[]={1,3,5,3};//Weights
		int l[]={1,2,3,4};//Length
		mergesort(w,l,0,w.length);// Sorting According to weights/length .
		System.out.println();
		int currCost=0;
		int minCost=0;
		for(int k=0;k<w.length;k++) {
			currCost+=l[k];
			minCost+=(w[k]*currCost);
		}
		System.out.println("MinCost :"+minCost);
	}
	public static void mergesort(int[] l,int [] w,int start,int end){
		if(end-start<2){
			return;
		}
		int mid=(start+end)/2;
		mergesort(l,w,start,mid);
		mergesort(l,w,mid,end);
		merge(l,w,start,mid,end);
	}
	public static void merge(int[] l,int [] w,int start,int mid,int end){
		if(((float)w[mid-1]/(float)l[mid-1])>=((float)w[mid]/(float)l[mid])){
			return;
		}
		int i=start;
		int j=mid;
		int tmpindex=0;
		int tmpindex2=0;
		int [] tmp=new int[end-start];
		int [] tmp2=new int[end-start];
		while(i<mid && j<end){	
			if(((float)w[i]/(float)l[i])<=((float)w[j]/(float)l[j])) {
				tmp[tmpindex]=l[j];
				tmp2[tmpindex++]=w[j++];
				
			}else {
				tmp[tmpindex]=l[i];
				tmp2[tmpindex++]=w[i++];
			}
		}
		System.arraycopy(l, i,l, start+tmpindex,mid-i);
		System.arraycopy(tmp,0,l,start,tmpindex);
		System.arraycopy(w, i,w, start+tmpindex,mid-i);
		System.arraycopy(tmp2,0,w,start,tmpindex);
	}
}
