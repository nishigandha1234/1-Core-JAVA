//3   6   12   24   48   96  192 
//(Each term doubles from the previous term starting at 3)
import java.util.*;
class Series60
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int num = 3;
		for(int i = 1 ; i<= n ; i++)
		{
			System.out.print(num+" ");
			num*=2;
		}
	}
}