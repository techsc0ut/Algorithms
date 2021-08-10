public static long solution(int[] arr){
    //write your code here
        long res=0;
        for(int i=0;i<32;i++){
            long onBits=0;
            for(int x:arr){
                if((x & (1 << i))!=0){
                    onBits++;
                }
            }
            long offBits=arr.length-onBits;
            res+=(onBits*offBits*2);
        }
        return res;
  }
