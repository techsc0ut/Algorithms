// The idea here is , first transpose the matrix , then simply for every column swap the elements of top and bottom , using two pointers .

import java.io.*;

class ABC {
	public static void main (String[] args) {
	    int arr[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
        rotate90(arr);
        printMat(arr,arr.length);
	}
	public static void printMat(int m[][],int N){
	    for(int i=0;i<N;i++){
	        for(int j=0;j<N;j++){
	            System.out.print(m[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
	public static void rotate90(int m[][]){
	    int N=m.length;
	    for(int i=0;i<N;i++){
	        for(int j=i;j<N;j++){
	            int temp=m[i][j];
	            m[i][j]=m[j][i];
	            m[j][i]=temp;
	        }
	    }
	    for(int i=0;i<N;i++){
	        int a=0;
	        int b=N-1;
	        while(a<=b){
	            int temp=m[a][i];
	            m[a][i]=m[b][i];
	            m[b][i]=temp;
	            a++;
	            b--;
	        }
	    }
	}
}
