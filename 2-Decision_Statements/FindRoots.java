import java.util.*;

public class FindRoots
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a, b , c : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = (b*b) - (4*a*c); 
		
		if(d > 0)
		{
			double root1 = (-b + Math.sqrt(d))/ (2*a);
			double root2 = (-b - Math.sqrt(d))/ (2*a);
			
			System.out.println("Root1 : " + root1);
			System.out.println("Root2 : " + root2);
		}
		else if(d == 0)
		{
			double root = -b / (2*a);
						
			System.out.println("Root1 = Root2 : " + root);
		}
		else {
            System.out.println("No real roots");
        }
	}
}