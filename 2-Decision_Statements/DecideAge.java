import java.util.*;

public class DecideAge
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		
		if(age < 12)
			System.out.println("Child");
		if(age >= 13 && age < 18)
			System.out.println("Teenager");
		if(age >= 19 && age < 55) 
			System.out.println("Adult");
		if(age > 55)  System.out.println("Senior");
	}
}