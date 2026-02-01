public class TotalSalary
{
	public static void main(String x[])
	{
		double bs = Integer.parseInt(x[0]);
		double da = bs*0.30;
		double hra = bs*0.30;
		double total = bs+hra+da;
		
		System.out.println("The Total Salary is : "+total);
	}
}