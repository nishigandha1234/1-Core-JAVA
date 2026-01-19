import java.util.Scanner;

public class IncomeEligibilty
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage of Student: ");
		int percentage = sc.nextInt();
		System.out.println("Enter the Income of Student: ");
		double income = sc.nextDouble();
		
		System.out.println(percentage >= 75 && income < 200000 ? "Eligible" : "Not Eligible");
	}
}