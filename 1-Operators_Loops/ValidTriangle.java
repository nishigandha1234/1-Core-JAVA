import java.util.*;

public class ValidTriangle
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle 1 in degree: ");
		int angle1 = sc.nextInt();
		System.out.println("Enter angle 2 in degree: ");
		int angle2 = sc.nextInt();
		System.out.println("Enter angle 3 in degree: ");
		int angle3 = sc.nextInt();
	
		int sum = angle1+angle2+angle3;
	
		System.out.println(sum == 180 ? "The Traingle is Valid Triangle" : "The Traingle is NOT a Valid Triangle");
	}
}