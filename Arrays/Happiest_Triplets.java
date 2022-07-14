class Solution{
    ArrayList<Integer> smallestDifferenceTriplet(int a[],int b[],int c[],int n){
        ArrayList<Integer> Res=new ArrayList<>();
        Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
        int ans=Integer.MAX_VALUE;
        int ind1=0, ind2=0, ind3=0;
        int sum=0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int rmax=0, rmin=0, rmid=0;
        while(ind1!=a.length && ind2!=b.length && ind3!=c.length){
            sum=a[ind1]+b[ind2]+c[ind3];
            max=Math.max(a[ind1],Math.max(b[ind2],c[ind3]));
            min=Math.min(a[ind1],Math.min(b[ind2],c[ind3]));
            if(a[ind1]==min){
                ind1++;
            }
            if(b[ind2]==min){
                ind2++;
            }
            if(c[ind3]==min){
                ind3++;
            }
            if(ans>max-min){
                ans=max-min;
                rmax=max;
                rmin=min;
                rmid=sum-(max+min);
            }
        }
        Res.add(rmax); Res.add(rmid); Res.add(rmin);
        return Res;
    }
}
