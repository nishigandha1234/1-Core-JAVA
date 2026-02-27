//412

import java.util.*;


public class FizzBuzz
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		String[] s = new String[n];
		
		for(int i = 1 ; i<=n ; i++)
		{
			if(i%3==0 && i%5==0)
			{
				s[i-1] = "FizzBuzz";
			}
			else if(i%3==0)
			{
				s[i-1] = "Fizz";
			}
			else if(i%5==0)
			{
				s[i-1] = "Buzz";
			}
			else{
				s[i-1] = String.valueOf(i);
			}
		}
		System.out.print(Arrays.toString(s));
	}
}