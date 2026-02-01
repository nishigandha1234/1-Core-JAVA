import java.util.*;

public class SeatApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Seats Available : ");
		int m = sc.nextInt();
		System.out.println("Enter the Already Booked Seats : ");
		int k = sc.nextInt();
		System.out.println("Enter the Seats Wants to book : ");
		int n = sc.nextInt();
		
		int totalSeats = n+k;
		
		if(totalSeats < m) System.out.println("YES");
		else System.out.println("NO");
	}
}