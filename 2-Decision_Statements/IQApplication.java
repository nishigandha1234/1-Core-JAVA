import java.util.*;

public class IQApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Current IQ of Chef : ");
		int n = sc.nextInt();
		int finalIq = n + 7;
		
		if(finalIq > 170)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}