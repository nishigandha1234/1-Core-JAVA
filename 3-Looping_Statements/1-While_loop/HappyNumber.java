import java.util.*;

public class HappyNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num; //19
		
		while(temp != 1 && temp != 4) 
		{
			int sum = 0; 
			
			while(temp != 0) //100!=0
			{
				int rem = temp%10; //0
				sum += rem*rem; //sum=1
				temp/=10; 
			}
			temp = sum; //temp = 1
		}
		if(temp == 1) System.out.println("Happy Number"); 
		else System.out.println("Not Happy Number");
	}
}
		
		