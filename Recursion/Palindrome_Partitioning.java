class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> Res=new ArrayList<>();
        func(s,new ArrayList<>(),Res);
        return Res;
        
    }
    static void func(String s,List<String> ds,List<List<String>> Res){
        if(s.length()==0){
            Res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<s.length();i++){
            String curr=s.substring(0,i+1);
            String rem=s.substring(i+1);
            if(IsPalindrome(curr)){
                ds.add(curr);
                func(rem,ds,Res);
                ds.remove(ds.size()-1);
            }
        }
    }
    static boolean IsPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
