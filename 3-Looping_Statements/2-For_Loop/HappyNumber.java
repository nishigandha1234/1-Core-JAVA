import java.util.Scanner;

class HappyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num ;
		while(temp != 1 && temp != 4)
		{
			int sum = 0;
			for( ; temp != 0 ; temp/=10)
			{
				int rem = temp%10;
				sum += rem*rem;
			}
			temp = sum;
		}
		if(temp==1) System.out.println(num+" Happy Number");
		else System.out.println(num+" Not Happy Number");
	}
}