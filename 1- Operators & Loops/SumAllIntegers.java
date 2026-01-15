import java.util.*;

class SumAllIntegers
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num != 0)
		{
			sum += (num%10);
			num/=10;
		}
		System.out.println(sum);
	}
}
		