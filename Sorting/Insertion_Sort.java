/* Best Time Complexity is O(n) , occurs when array is pre-sorted 
   whereas the Average and Worst case time complexity is O(n^2) */

void Insertion_sort(int arr[]){
		int n=arr.length;
      	for(int i=0;i<n;i++){
        	int temp=arr[i];
          	int j=i-1;
          	while(j>=0 && arr[j]>temp){
              	arr[j+1]=arr[j];
              	j--;
            }
          	arr[j+1]=temp;
        }
	}
