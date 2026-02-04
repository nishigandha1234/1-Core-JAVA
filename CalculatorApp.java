import java.util.*;

public class CalculatorApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operation you want to perform from Below : ");
		System.out.println();
		System.out.println("Case 1 : Addition");
		System.out.println("Case 2 : Subtraction");
		System.out.println("Case 3 : Multiplication");
		System.out.println("Case 4 : Division");
		System.out.println("Case 5 : Modulus");
		System.out.println();
		int operation = sc.nextInt();
		
		System.out.println("Enter the Value of A : ");
		int a = sc.nextInt();
		System.out.println("Enter the Value of B : ");
		int b = sc.nextInt();
		int c ;
		
		switch(operation)
		{
			case 1 : 
			{
				c = a + b;
				System.out.println("The Addition of Two Number is : " + c);
				break;
			}
			case 2 : 
			{
				c = a - b;
				System.out.println("The Subtraction of Two Number is : " + c);
				break;
			}
			case 3 : 
			{
				c = a * b;
				System.out.println("The Multiplication of Two Number is : "+c);
				break;
			}
			case 4 : 
			{
				c = a / b;
				System.out.println("The Division of Two Number is : "+c);
				break;
			}
			case 5 : 
			{
				c = a % b;
				System.out.println("The Modulus of Two Number is : "+c);
				break;
			}
			default : 
			{
				System.out.println("Invalid Operators");
				break;
			}
		}
	}
}
		