//7  10  15  22  31  42  55  70
import java.util.*;
class Series56
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int diff = 3, num = 7;
		for(int i = 1 ; i<=n ; i++)
		{
			System.out.print(num+" ");
			num = num+diff;
			diff+=2;
		}
	}	
}