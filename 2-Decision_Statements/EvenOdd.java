import java.util.*;

public class EvenOdd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}