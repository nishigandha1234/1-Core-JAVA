
public class SumAllNaturalNum
{
	public static void main(String x[])
	{
		int i = 1;
		int sum = 0;
		
		while(i <= 50)
		{
			sum += i;
			i++;
		}
		System.out.println("Sum of All Natural Numbers : " + sum);
	}
}