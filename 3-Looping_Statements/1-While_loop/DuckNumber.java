import java.util.*;
//if number is containing 0 then its duck number
public class DuckNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		boolean flag = false;
		
		while(n != 0)
		{
			if((n % 10) == 0)
			{
				flag = true;
				break;
			}
			n/=10;	
		}
		if(flag){
			System.out.println("The Number is Duck Number: ");
		}
		else{
			System.out.println("The Number is NOT Duck Number: ");
		}
	}
}
		