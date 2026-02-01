import java.util.*;

public class SpyNumberForFourDig
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //1412
		int sum = (num%10) + ((num/10)%10) + ((num/100)%10) + ((num/1000)%10);
		System.out.println(sum);
	}
}