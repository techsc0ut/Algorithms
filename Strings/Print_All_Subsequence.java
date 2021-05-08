import java.io.*;
import java.util.*;

class GFG {
    static ArrayList<String> A=new ArrayList<>();
	public static void main (String[] args) {
		String S="aabc", V="";
		func(S,V);
		System.out.println(A);
	}
	public static void func(String input, String Output){
	    if(input.length()==0){
	        A.add(Output);
	        return;
	    }
	    func(input.substring(1),Output+input.charAt(0));
	    func(input.substring(1),Output);
	}
}
