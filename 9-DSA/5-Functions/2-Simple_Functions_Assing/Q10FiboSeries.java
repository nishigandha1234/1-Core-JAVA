
class Q10FiboSeries
{
	public static void main(String x[])
	{
		int n = 10;
		
		fiboSeries(n);
	}
	public static void fiboSeries(int n)
	{
		int a = 0 , b = 1;
		System.out.print(a + " " + b +" " );
		for(int i = 2 ; i <= n  ; i++)
		{
			int c = a+b ;
			System.out.print(c +" ");
			a = b ; 
			b = c;
		}
		
	}
}