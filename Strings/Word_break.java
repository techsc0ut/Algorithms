class Sol{
    public static int wordBreak(String A, ArrayList<String>B){   
        int n=A.length();
        int total=0;
        String curr="";
        for(int i=0;i<n;i++){
            curr+=A.charAt(i);
            if(B.contains(curr)){
                total+=curr.length();
                curr="";
            }            
        }
        if(total==n){
            return 1;
        }
        return 0;
    }
}
