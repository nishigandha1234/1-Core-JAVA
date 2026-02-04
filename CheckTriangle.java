import java.util.*;

public class CheckTriangle 
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side 1 of Triangle : ");
		int side1 = sc.nextInt();
		System.out.println("Enter the Side 2 of Triangle : ");
		int side2 = sc.nextInt();
		System.out.println("Enter the Side 3 of Triangle : ");
		int side3 = sc.nextInt();
			
		if(side1 == side2 && side2 == side3 && side1 == side3)
		{
			System.out.println("Its Equilateral Triangle");
		}
		else if(side1 == side2 && side2 == side3 || side1 == side2 && side1 == side3)
		{
			System.out.println("Its Isoscale Triangle");
		}
		else
		{
			System.out.println("Its Scalene Triangle");
		}	
	}
}