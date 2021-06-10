static void print( ArrayList<Integer> v, int i)
{
	for (int j = i; j < v.size(); j++)
		System.out.print( v.get(j) + " ");
		System.out.println();
}
static void printKPathUtil(Node root, int k)
{
	if(root==null){
    	return ;
    }
  	path.add(root.data);
  	printKPathUtil(root.left,k);
  	printKPathUtil(root.right,k);
  	int f=0;
  	for(int i=path.size()-1;i>=0;i--){
    	f+=path.get(i);
      	if(f==k){
        	print(path,i);
        }
    }
 	path.remove(path.size()-1);	
}

// A wrapper over printKPathUtil()
static void printKPath(Node root, int k)
{
	path = new ArrayList<Integer>();
	printKPathUtil(root, k);
}
