import java.util.*;
public class ProductNaturalNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int i = 1;
		int prod = 1;
		int n = sc.nextInt();
		while(n != 0)
		{
			int rem = n % 10;
			
			prod *= rem;
			n/=10;
		}
		System.out.println("Product of All Natural Numbers : " + prod);
	}
}