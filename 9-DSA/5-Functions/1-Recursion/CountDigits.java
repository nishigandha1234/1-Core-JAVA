
class CountDigits
{
	public static void main(String x[])
	{
		int num = 1234;
		System.out.println(countDig(num));
	}
	public static int countDig(int n)
	{
		if(n == 0)
			return 0;
			
		return 1+countDig(n/10);
	}
}