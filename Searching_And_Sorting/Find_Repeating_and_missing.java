class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] freq=new int[n+1];
        freq[0]=1;
        int []A=new int[2];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<=n;i++){
            if(freq[i]==0){
                A[1]=i;
            }
            if(freq[i]>1){
                A[0]=i;
            }
        }
        return A;
    }
}
