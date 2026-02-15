import java.util.Scanner;

class MaxMinofGiven
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num;
		int max = 0;
		int min = 9;
		
		while(temp!=0) //123!=0
		{
			int rem = temp%10; //3
			if(rem > max) //3>0
			{
				max = rem; //max = 3
			}
			if(rem < min) //3<9
			{
				min = rem; //3
			}
			temp/=10; //12
		}
		System.out.println("max : "+max);
		System.out.println("Min : "+min);
	}
}