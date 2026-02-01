import java.util.*;

public class ReverseNaturalNum
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n Value : ");
		int n = 0;
		int i = 50;
		while(i > n)
		{
			System.out.print(", " + i--);
		}
	}
}