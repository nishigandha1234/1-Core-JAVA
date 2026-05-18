/*59 Recursive Decimal to binary */

class RecursiveDecimalToBinary59
{
	public static void main(String x[])
	{
		int n = 5;
		convertBinary(n);
	}
	public static void convertBinary(int n)
	{
		if(n == 0)
		{
			return;	
		}
		convertBinary(n/2);
		System.out.println(n%2);
	}
}