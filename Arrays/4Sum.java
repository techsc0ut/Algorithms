class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> A=new ArrayList();
        for(int i=0;i<n-3;i++){
            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j!=i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int a=j+1;
                int b=n-1;
                while(a<b){
                    int p=arr[i]+arr[j]+arr[a]+arr[b];
                    if(p==k){
                        ArrayList<Integer> AT=new ArrayList();
                        AT.add(arr[i]);AT.add(arr[j]);AT.add(arr[a]);AT.add(arr[b]);
                        A.add(AT);
                        a++;
                        b--;
                        while(a<b && arr[b]==arr[b+1] ){
	                        b--;
	                    }
	                    while(a<b && arr[a]==arr[a-1]){
	                        a++;
	                    }
                    }else if(p>k){
                        b--;
                    }else{
                        a++;
                    }
                }
            }
        }
        return A;
    }
}
