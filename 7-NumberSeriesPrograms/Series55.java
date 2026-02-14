// 5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
import java.util.*;
class Series55
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		for(int i =1 ; i<= n;i++)
		{
			System.out.print((5*i)+" "+(3*i)+" ");
		}
	}
}