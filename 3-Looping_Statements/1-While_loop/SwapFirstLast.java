import java.util.*;

public class SwapFirstLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int first, mid, last , n = 1;
		int temp = num;
		last = num %10;
		while(temp > 9)
		{
			n *= 10;
			temp /= 10;
		}
		first = num / n ;
		mid = (num % n) / 10;
		num = last* n + mid*10 + first;
		System.out.println(num);
	}
}
		