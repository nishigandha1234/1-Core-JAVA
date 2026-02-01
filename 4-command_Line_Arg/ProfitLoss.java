public class ProfitLoss
{
	public static void main(String x[])
	{
		int sp = Integer.parseInt(x[0]);
		int cp = Integer.parseInt(x[1]);
		String result = sp > cp ? "Profit" : "Loss";
		System.out.println(result);
	}
}
		
