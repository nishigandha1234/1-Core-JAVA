import java.util.*;

public class EquiIscoSceTriangle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of Traingle in degree : ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if(side1 == side2 && side2 == side3 && side1 == side3)
		{
			System.out.println("Equilateral Traingle");
		}
		else if(side1== side2 || side2==side3 || side1==side3)
		{
			System.out.println("isoscale Traingle");
		}
		else{
			System.out.println("scalen Traingle");

		}
	}
}