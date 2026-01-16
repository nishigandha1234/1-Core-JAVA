import java.util.*;

class SpyNumber
{
	public static void main(String [] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int prod = 1;
		int sum = 0;
		while(num !=0)
		{
			prod *= (num%10);
			sum += (num%10);
			num /= 10;
		}
		
		System.out.println("Product : "+prod);
		System.out.println("Sum : "+sum);
		
		if(sum == prod)
		{
			System.out.println("This is Spy Number");
		}
		else
		{
			System.out.println("This is not a Spy number");
		}
	}
}