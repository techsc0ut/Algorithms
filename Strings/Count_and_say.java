class Solution {
    public String countAndSay(int n) {
       String Result="1";
        for(int i=1;i<n;i++){
            Result=say(Result,Result.length());
        }
        return Result;
        
    }
    public String say(String s,int n){
       char [] a=s.toCharArray();
       StringBuilder output = new StringBuilder();
       int freq=0;
       char latest=a[0]; 
       for(int i=0;i<n;i++){
           if(a[i]==latest){
               freq++;
           }else{
               output.append(freq).append(latest);
               freq=1;
               latest=a[i];
           }
       }
       return output.append(freq).append(latest).toString(); 
    }
}
