import java.util.Scanner;

public class EligibleToVote
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of Person: ");
		int age = sc.nextInt();
		
		System.out.println(age >= 18 ? "Eligible to Vote" : "NOT Eligible to Vote");
	}
}