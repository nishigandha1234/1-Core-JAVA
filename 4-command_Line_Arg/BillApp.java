public class BillApp
{
	public static void main(String s[])
	{
		int quantity = Integer.parseInt(s[0]);
		int rate = Integer.parseInt(s[1]);
		int total = quantity*rate;
		System.out.println("Total is : "+total);
	}
}