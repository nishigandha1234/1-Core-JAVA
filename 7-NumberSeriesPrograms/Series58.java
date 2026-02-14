//2 6 12 20 30 42 56 72 90 110
//(n(n+1) pattern multiplied by 2)*


class Series58
{
	public static void main(String x[])
	{
		int n = 1;
		for(int i = 1 ; i <= 9 ; i++)
		{
			System.out.print( (n*(n+1)) +" "); //2
			n++; 
		}
	}
}