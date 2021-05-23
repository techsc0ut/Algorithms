class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int T) {
        // code here
        int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(T>n){
            return arr2[T-n-1];
        }
        return arr1[T-1];
    }
}
