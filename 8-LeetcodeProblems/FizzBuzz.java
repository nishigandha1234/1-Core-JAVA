//412

import java.util.*;
public class FizzBuzz
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0)
		{
			System.out.println("FizzBuzz Number");
		}
		else if(num%3==0)
		{
			System.out.println("Fizz Number");
		}
		else if(num%5==0)
		{
			System.out.println("Buzz Number");
		}
		else{
			System.out.println("NOT a FizzBuzz Number");
		}
	}
}