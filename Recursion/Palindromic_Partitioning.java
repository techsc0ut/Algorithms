class Solution {
    static List<List<String>> Res;
    public List<List<String>> partition(String s) {
        Res=new ArrayList<>();
        func(s,new ArrayList<>());
        return Res;
    }
    static boolean checkPal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }return true;
    }
    static void func(String s, List<String> Lst){
        if(s.length()==0){
            Res.add(new ArrayList<>(Lst));
            return ;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            String cur=s.substring(0,i+1);
            String rem=s.substring(i+1);
            if(checkPal(cur)){
                Lst.add(cur);
                func(rem,Lst);
                Lst.remove(Lst.size()-1);
            }
        }
    }
}
