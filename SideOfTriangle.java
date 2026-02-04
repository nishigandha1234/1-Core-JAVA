import java.util.*;

public class SideOfTriangle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side 1 of Traingle : ");
		int side1 = sc.nextInt(); //60
		System.out.println("Enter the Side 2 of Traingle : ");
		int side2 = sc.nextInt(); //60
		int sum = side1 + side2; //120
		
		int triSum = 180 - sum; //180-120
		System.out.println("Third Angle is : "+triSum); //60
	}
}