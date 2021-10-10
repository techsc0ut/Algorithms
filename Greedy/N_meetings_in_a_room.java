class Solution {
    public static int maxMeetings(int start[], int end[], int n){
        Meet[] meet=new Meet[n];
        for(int i=0;i<n;i++){
            meet[i]=new Meet(start[i],end[i]);
        }
        Arrays.sort(meet);
        int count=1;
        int x=meet[0].e;
        for(int i=1;i<n;i++){
            if(meet[i].s>x){
                count++;
                x=meet[i].e;
            }
        }
        return count;
    }
}
class Meet implements Comparable<Meet>{
    int s;
    int e;
    Meet(int _s,int _e){
        this.s=_s;
        this.e=_e;
    }
    public int compareTo(Meet a){
        return this.e-a.e;
    }
}
