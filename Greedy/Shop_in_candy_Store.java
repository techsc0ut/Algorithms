class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int k){
        ArrayList<Integer> A=new ArrayList<Integer>();
        Arrays.sort(candies);
        int costMin=0;
        int i=0,j=N-1;
        while(i<=j){
            costMin+=candies[i];
            j-=k;i++;
        }
        int costMax=0;
        i=N-1;j=0;
        while(i>=j){
            costMax+=candies[i];
            j+=k;i--;
        }
        A.add(costMin);
        A.add(costMax);
        return A;
    }
}
