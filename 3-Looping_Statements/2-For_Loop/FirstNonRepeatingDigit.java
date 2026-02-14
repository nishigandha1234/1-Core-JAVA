import java.util.Scanner;

public class FirstNonRepeatingDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //1213
		int temp = num; 
		int ans = -1;
		
		while(temp!=0) 
		{
			int count = 0;
			int check = num; //1213
			int rem = temp%10; //3
			
			while(check != 0) 
			{
				if(check%10 == rem)
					count++; //4
				check/=10;
			}
			if(count==1) 
			{
				ans=rem;
			}
			temp/=10;
		}
		if(ans != -1) System.out.println("Non-repeating Digit : "+ans);
		else System.out.println("No Non-repeating Digit ");
	}
}