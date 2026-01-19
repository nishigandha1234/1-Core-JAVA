import java.util.Scanner;

public class PassingCriteria
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Student: ");
		int marks = sc.nextInt();
		
		System.out.println(marks >= 40 ? "Pass" : "Fail");
	}
}