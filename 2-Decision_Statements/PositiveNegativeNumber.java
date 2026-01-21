import java.util.*;

public class PositiveNegativeNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num1 = sc.nextInt();
		
		if(num1 > 0)
		{
			System.out.println("Positive");
		}
		else if(num1 < 0)
		{
			System.out.println("Negative");
		}
		else if(num1 == 0){
			System.out.println("zero");
		}
		else{
			System.out.println("Not A NUmber");
		}
	}
}