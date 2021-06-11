// Java program to calculate Kth ancestor of given node
import java.util.*;
class Solution
{

// A Binary Tree Node
static class Node
{
	int data;
	Node left, right;
};

// temporary node to keep track of Node returned
// from previous recursive call during backtrack
static Node temp = null;
static int k;
static boolean lca(Node root, ArrayList<Integer> A,int n){
	if(root==null){
      return false;
    }
  	A.add(root.data);
  	if(root.data==n){
    	return true;
    }
  	if(lca(root.left,A,n) || lca(root.right,A,n)){
    	return true;
    }
  	A.remove(Integer.valueOf(root.data));
  	return false;
}
public static void main(String args[]){
	// Let us create binary tree shown in above diagram
	Node root = newNode(1);
	root.left = newNode(2);
	root.right = newNode(3);
	root.left.left = newNode(4);
	root.left.right = newNode(5);
  	root.left.right.left = newNode(6);

	k = 1;
	int node = 2;
	ArrayList<Integer> A=new ArrayList<Integer>();
	// print kth ancestor of given node
	lca(root,A,node);
  	int i;
  	for(i=0;i<A.size();i++){
    	if(A.get(i)==node){
        	break;
        }
    }
  	int index=i-k;
  	if(!(index<0)){
		System.out.println(A.get(index));    	
    }else{
    	System.out.println(-1);
    }  
}
}
