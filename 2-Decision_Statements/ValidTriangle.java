import java.util.*;

public class ValidTriangle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of Traingle in degree : ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if((side1+side2+side3) == 180)
		{
			System.out.println("Valid Traingle");
		}
		else
		{
			System.out.println("NOT Valid Traingle");
		}
	}
}