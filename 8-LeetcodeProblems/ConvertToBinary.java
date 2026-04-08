//693. Binary Number with Alternating Bits
//Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

class ConvertToBinary 
{
	public static void main(String x[])
	{
		int n = 5;
		hasAlternatingBits(n);
	}
    public static void hasAlternatingBits(int n) 
    {
        int[] binary = new int[32];
        int index = 0 ;
        if(n > 0)
        {
            binary[index++] = n%2;
            n/=2;
        }
		for(int i = 0 ; i < index ; i++)
		{
			System.out.print(binary[i]+" " );
			System.out.print(binary[i]+" " );
		}
    }
}