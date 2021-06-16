class Solution {
    public static int maxMeetings(int start[], int end[], int n){
        if(n==1){
            return 1;
        }
        temp [] t=new temp[n];
        for(int i=0;i<n;i++){
            t[i]=new temp(start[i],end[i]);
        }
        Arrays.sort(t,new comp());
        int count=1;
        temp prev=t[0];
        for(int i=1;i<n;i++){
            if(t[i].s>prev.e){
                count++;
                prev=t[i];
            }
        }return count;
    }
}
class temp{
    int s;
    int e;
    temp(int ss,int ee){
        this.s=ss;
        this.e=ee;
    }
}
class comp implements Comparator<temp>{
    public int compare(temp t1,temp t2){
        return t1.e-t2.e;
    }
}
