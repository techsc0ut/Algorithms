class Solution {
    static int getGAP(int x){
        if(x<=1){
            return 0;
        }
        return x/2+x%2;
    }
    public void merge(int arr1[], int arr2[], int n, int m) {
        int t=n+m;
        int gap=getGAP(n+m);
        while(gap!=0){
            int i=0,j=gap;
            while(i<t && j<t){
                if(i<n && j<n){
                    if(arr1[i]>arr1[j]){
                        swap(arr1,i,arr1,j);
                    }       
                }
                else if(i<n && j>=n && j<t){
                    int J=j-n;
                    if(arr1[i]>arr2[J]){
                        swap(arr1,i,arr2,J);
                    }
                }
                else if(i>=n && j>=n && i<t && j<t){
                    int I=i-n,J=j-n;
                    if(arr2[I]>arr2[J]){
                        swap(arr2,I,arr2,J);
                    }
                }
                i++;j++;
            }
            gap=getGAP(gap);
        }
    }
    static void swap(int ar1[],int a,int ar2[],int b){
        int temp=ar1[a];
        ar1[a]=ar2[b];
        ar2[b]=temp;
    }
}
