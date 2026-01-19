import java.util.Scanner;

public class GradeCriteria
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Student out of 100 : ");
		int marks = sc.nextInt();
		
		System.out.println(marks <= 100 && marks >= 85 ? "Distinction" : marks <= 84 && marks >= 60 ? "Good" : marks <= 59 && marks >= 40 ? "Average" : "Fail");
	}
}