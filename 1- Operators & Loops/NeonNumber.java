import java.util.*;

class NeonNumber
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : "); 
		int num = sc.nextInt();
		int sum = 0;
		int square = num*num;
	
		System.out.println(square);
		
		while(square != 0)
		{
			sum += square % 10;
			square/=10;
		}
		System.out.println(sum);
		if(sum == num)
		{
			System.out.println("This is Neon NUMBER");
		}
		else
		{
			System.out.println("Thi s is NOT a Neon NUMBER");
		}
			
	}
}
	
	