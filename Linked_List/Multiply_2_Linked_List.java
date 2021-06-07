class GfG{
   public long multiplyTwoLists(Node l1,Node l2){
    long mod=1000000007L;
		long num1=0,num2=0;
		while(l1!=null||l2!=null){
			if(l1!=null){
				num1 = (num1*10+l1.data)%mod;
                l1 = l1.next;
			}
			if(l2!=null){
				num2 = (num2*10+l2.data)%mod;
                l2 = l2.next;
			}
		}
		//System.out.println(num1+"X"+num2);
		return (num1*num2)%mod;
   }
}
