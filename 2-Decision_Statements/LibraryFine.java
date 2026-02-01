import java.util.*;

public class LibraryFine
{
	public static void main(String x [])
	{
		Scanner sc = new Scanner(System.in);
		int daysLeft;
		int fine = 0;
		String status = "Active";
		
		System.out.println("Enter the Days late For Library : ");
		daysLeft = sc.nextInt();
		
		if(daysLeft <= 5)
			fine = daysLeft * 2;
		else if(daysLeft <= 10)
			fine = daysLeft * 3;
		else if(daysLeft <= 30)
			fine = daysLeft * 5;
		else{
			fine = 500;
			status = "Cancelled";
		}		
        System.out.println("Total Fine: Rs" + fine);
        System.out.println("Membership Status: " + status);
	}
}