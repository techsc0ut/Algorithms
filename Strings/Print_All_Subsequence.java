/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class practice{	static ArrayList<String> A=new ArrayList();
		public static void main (String[] args) {
		String S="aabc";
		func(S,"");
		System.out.println(A);
	}
	public static void func(String input, String Output){
	   	if(input.length()==0){
			A.add(Output);
			return;
		}
		func(input.substring(1),Output);
		func(input.substring(1),Output+input.charAt(0));
	}	
}
