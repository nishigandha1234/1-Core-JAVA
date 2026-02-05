import java.util.*;

public class NeonNumber
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int square = num*num;
		int sum = 0;
		
		while(square != 0)
		{
			int rem = square%10;
			sum+= rem;
			square/=10;
		}
		
		if(num == sum) System.out.println("Neon Number");
		else System.out.println("NOT Neon Number");
	}
}