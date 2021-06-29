public class BuildHeap {
	static void heapify(int arr[], int n, int i){
		    int min=i;
      	int l=2*i+1;
      	int r=2*i+2;
      	if(l<n && arr[l]<arr[min]){
        	min=l;
        }
      	if(r<n && arr[r]<arr[min]){
        	min=r;
        }
      	if(min!=i){
        	int temp=arr[min];
            arr[min]=arr[i];
           	arr[i]=temp;
            heapify(arr,n,min);
        }
	}
	static void buildHeap(int arr[], int n){
		// Index of last non-leaf node
		int startIdx = (n / 2) - 1;
		// Perform reverse level order traversal
		// from last non-leaf node and heapify
		// each node
		for (int i = startIdx; i >= 0; i--) {
			heapify(arr, n, i);
		}
	}
	static void printHeap(int arr[], int n){
		System.out.println("Array representation of Heap is:");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String args[]){
		// Binary Tree Representation
		// of input array
		// 1
		//		 /	 \
		// 3		 5
		//	 / \	 / \
		// 4	 6 13 10
		// / \ / \
		// 9 8 15 17
		int arr[] = { 1000, 300, 500, 4, 6, 13, 10,
					9, 8, 15, 17000 };
		int n = arr.length;
		buildHeap(arr, n);
		printHeap(arr, n);
	}
}
