import java.util.*;

public class ScholarshipEligibility
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Attendence : ");
		int attendence = sc.nextInt();
		System.out.println("Enter the Marks : ");
		int marks = sc.nextInt();
		
		if(attendence >= 75 && marks >= 80) System.out.println("Eligible for Scholarship");
		else System.out.println("NOT Eligible for Scholarship");
		
	}
}