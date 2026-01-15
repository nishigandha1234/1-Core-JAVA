import java.util.*;

class SimpleInterest
{	
	public static void main(String[] x)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Principal : ");
		int principal = sc.nextInt();
		System.out.println("Enter the Rate : ");
		int rate = sc.nextInt();
		System.out.println("Enter the Time : ");
		int time = sc.nextInt();
		
		double si = (principal * rate * time) / 100;
		
		System.out.println(si);
		
	}
}
