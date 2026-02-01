import java.util.*;

public class GuardsApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Guards as XX YY : ");
		int xx = sc.nextInt();
		int yy = sc.nextInt();
		
		if(xx >= yy)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}