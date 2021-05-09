class Solution {
    static List<String> L;
    public List<String> find_permutation(String S) {
        // Code here
        int n=S.length();
        StringBuilder SS=new StringBuilder(S);
        L=new ArrayList();
        permute(SS,0,n-1);
        Collections.sort(L);
        return L;
    }
    public static void permute(StringBuilder S,int l,int r){
        if(l==r){
            L.add(S.toString());
            return ;
        }
        for(int i=l;i<=r;i++){
            swap(S,l,i);
            permute(S,l+1,r);
            swap(S,l,i);
        }
    }
    public static void swap(StringBuilder S,int i ,int j){
        char temp=S.charAt(i);
        S.setCharAt(i,S.charAt(j));
        S.setCharAt(j,temp);
    }
}
