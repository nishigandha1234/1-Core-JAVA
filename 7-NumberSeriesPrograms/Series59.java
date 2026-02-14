//100   81   64   49   36   25   16   9   4   1 
//(Perfect squares in reverse order)
import java.util.*;
class Series59
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		for(int j = n ; j >= 1 ; j--)
		{
			System.out.print(j*j+" ");
		}
	}
}
