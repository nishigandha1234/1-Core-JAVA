
class Q6SpecialNumber
{
	public static void main(String x[])
	{
		int n = 54;
		specialNumber(n);
	}
	public static void specialNumber(int n)
	{
		int sum = 0 , prod = 1;
		int temp = n; 
		while(temp != 0)
		{
			int rem = temp % 10;
			sum += rem; 
			prod *= rem;
			temp /= 10;
		}
		System.out.println(sum);
		System.out.println(prod);
	}
}