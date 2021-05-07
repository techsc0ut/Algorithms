class Solution{
    static String longestPalin(String s){
        if(s.length()==0){
            return s;
        }
        else{
             int Final[]= {0,1};
		for(int i=1;i<s.length();i++) {
			int ar1[]=func(i-1,i+1,s);
			int ar2[]=func(i-1,i,s);
			int arf[]=func2(ar1,ar2);
			Final=func2(Final,arf);
		}
		return s.substring(Final[0],Final[1]);
        }    
        
    }
    public static int[] func2(int[] ar1,int[] ar2) {
		if((ar2[1]-ar2[0])>(ar1[1]-ar1[0])) {
			return ar2;
		}
		
		else {
			return ar1;
		}
	}
	public static int [] func(int a,int b,String s) {
		while(a>=0 && b<s.length()){
			if(s.charAt(a)==s.charAt(b)) {
				a--;
				b++;
			}
			else {
				break;
			}
		}
		a++;
		return new int[] {a,b};
	}
    
}
