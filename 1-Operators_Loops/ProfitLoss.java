import java.util.*;

public class ProfitLoss
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Selling Price : ");
		double sellingPrice = sc.nextDouble();
		System.out.println("Enter Cost Price : ");
		double costPrice = sc.nextDouble();
		
		System.out.println(sellingPrice < costPrice ? "Profit" : "Loss");
	}
}
		