class Solution {
    public int romanToInt(String s) {
        
        if(s.length()==0) return -1;
        
        HashMap<Character,Integer> H=new HashMap<>();
        H.put('I',1); H.put('V',5);
        H.put('X',10); H.put('L',50);
        H.put('C',100); H.put('D',500);
        H.put('M',1000);
        
        int len=s.length();
        int ans=H.get(s.charAt(len-1));
        
        for(int i=len-2;i>=0;i--){
          
            char c=s.charAt(i);
          
            if(H.get(c)>=H.get(s.charAt(i+1))){
    
                ans+=H.get(c);
              
            }else{
              
                ans-=H.get(c);
              
            }
          
        }
        
        return ans;
    }
}
