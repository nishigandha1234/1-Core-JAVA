import java.util.*;

public class CalculateTotalPercentage
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Subjects : ");
		int n = sc.nextInt();
		int total = 0;
		for(int i = 0; i <= n ; i++)
		{
			System.out.print("Enter marks for subjects " + i + ": ");
			int marks = sc.nextInt();
			total += marks;
		}
		
		double percentage = (total * 100)/(n * 100);
		System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
	}
}