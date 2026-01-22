import java.util.*;

public class StudentScore
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage : ");
		int percentage = sc.nextInt();
		
		if(percentage >= 90) System.out.println((percentage)+" Excellent");
		else if(percentage >= 75) System.out.println((percentage)+" Good");
		else if(percentage >= 50) System.out.println((percentage)+" Average");
		else System.out.println((percentage)+" Poor");
	}
}