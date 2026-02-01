import java.util.*;

public class CabApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CAB Payment for both Cabs : ");
		int xx = sc.nextInt();
		int yy = sc.nextInt();
		
		if(xx < yy)
			System.out.println("First");
		else if(xx == yy)
			System.out.println("Equal");
		else 
			System.out.println("Second");
	}
}
