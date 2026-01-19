import java.util.*;

public class EquiIsoScaleneTraingle
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side 1 : ");
		int side1 = sc.nextInt();
		System.out.println("Enter side 2 : ");
		int side2 = sc.nextInt();
		System.out.println("Enter side 3 : ");
		int side3 = sc.nextInt();
		
		System.out.println(side1 == side2 && side2 == side3 && side1 == side3 ? "All Sides are Equal So, Equilateral Triangle" : side1==side2 || side2==side3 || side1 == side3 ? "Two Sides are Equal, Isosceles Triangle" : "No sode are Equal, Scalene Traingle");
	}
}
		