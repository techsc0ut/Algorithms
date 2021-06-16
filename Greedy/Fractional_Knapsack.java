class Solution{
    double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr,new comp());
        double profit=0;
        int w=0;
        for(int i=0;i<n;i++){
            if(w+arr[i].weight<=W){
                w+=arr[i].weight;
                profit+=arr[i].value;
            }else{
                int rem=W-w;
                profit+=arr[i].value*((double)rem/arr[i].weight)*1.0;
                break;
            }
        }
        return profit;
    }
}
class comp implements Comparator<Item>{
    public int compare(Item a, Item b){
        double r1 = (double)a.value / a.weight;
        double r2 = (double)b.value / b.weight;
        if(r1 > r2){
            return -1;
        } else if(r1 < r2) {
            return 1;
        }
        return 0;
    }
}
