import java.util.*;

public class ProfitLoss
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Selling Price : ");
		int sp = sc.nextInt();
		System.out.println("Enter Cost Price : ");
		int cp = sc.nextInt();
		
		if(sp > cp)
		{
			System.out.println("Profit");
		}
		else{
			System.out.println("Loss");
		}
	}
}