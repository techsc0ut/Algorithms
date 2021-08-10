// Java program to check if k-th bit
// of a given number is set or not

class Number {
	public static void isKthBitSet(int n,
								int k)
	{
		if ((n & (1 << (k - 1))) > 0)
			System.out.print("SET");
		else
			System.out.print("NOT SET");
	}

	// driver code
	public static void main(String[] args)
	{
		int n = 5, k = 1;
		isKthBitSet(n, k);
	}
}

// This code is contributed by rishabh_jain
