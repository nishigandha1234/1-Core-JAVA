import java.util.*;

public class FindPower
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Value : ");
		int base = sc.nextInt();
		System.out.println("Enter the Power(Index) : ");
		int index = sc.nextInt();
		int i =1,pow = 1 ;
		while(i <= index)
		{
			pow *= base;
			i++;
		}
		System.out.println(pow);
	}
}