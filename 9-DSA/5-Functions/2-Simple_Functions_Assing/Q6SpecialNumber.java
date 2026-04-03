
class Q6SpecialNumber
{
	public static void main(String x[])
	{
		int n = 12;
		specialNumber(n);
	}
	public static void specialNumber(int n)
	{
		int sum = 0 , prod = 1;
		int temp = n ;
		while(temp != 0 )
		{
			int rem = temp % 10;
			sum += rem;
			prod *= rem;
			temp /= 10;
		}
		if(sum == prod)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("NOT Equal");
		}
	}
}