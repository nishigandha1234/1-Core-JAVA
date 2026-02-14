import java.util.Scanner;

class DifferInEvenOddPos
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		
		while(temp!=0) //1234
		{
			count++; //4
			temp/=10; 
		}
		
		int evenSum = 0, oddSum=0;
		temp = num;
		
		while(count!=0) //2!=0
		{
			if(count%2==0) 
			{
				evenSum+=temp%10; 
			}
			else
			{
				oddSum+=temp%10;
			}
			count--;
			temp/=10;
		}
		int diff = evenSum-oddSum;
		System.out.println(diff < 0? "The Difference is : "+(-diff) : "The Difference is : "+diff);
	}
}