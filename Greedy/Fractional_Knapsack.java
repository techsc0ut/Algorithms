class Solution{
    double fractionalKnapsack(int W, Item arr[], int n){
        Arrays.sort(arr,new comp());
        double profit=0;
        int curW=0;
        for(int i=0;i<n;i++){
            if(curW+arr[i].weight<=W){
                curW=curW+arr[i].weight;
                profit+=arr[i].value;
            }else{
                int rem=W-curW;
                profit+=arr[i].value*((double)rem/arr[i].weight)*1.0;
                break;
            }
        }
        return profit;
    }
}
class comp implements Comparator<Item>{
    public int compare(Item a, Item b){
        double aa=(double)a.value/a.weight;
        double bb=(double)b.value/b.weight;
        if(bb>aa){
            return 1;
        }else if(bb<aa){
            return -1;
        }return 0;
    }
}
