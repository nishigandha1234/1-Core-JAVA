import java.util.Scanner;

class RotateKTimes
{
	public static void main(String[]x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //123456
		System.out.println("Enter Value of K : ");
		int k = sc.nextInt(); //2
		int rev = 0 ;
		int temp = num;
		
		while(temp != 0)
		{
			rev = rev*10+(temp%10);
			temp/=10;
		}
		System.out.println(rev);
		
		//find value of k & pow it k=2 
		//	i=1		   2<=2
		int pow=1;
		for(int i = 1 ; i <= k ; i++)
		{
			pow*=10; 
		}
		//System.out.println(pow); //100
		
		int res = rev%pow; //654321%100 == 21
		int revLast = 0;
		while(res!=0) 
		{
			int dig = res%10;
			revLast = revLast*10 + dig;
			res/=10; 
		}
		//System.out.println(revLast);
		
		int revFirst = 0;
		int ans = rev/pow;
		while(ans != 0)
		{
			int digit = ans%10;
			revFirst = revFirst*10 + digit;
			ans/=10;
		}
		//System.out.println(revFirst);
		System.out.println(revFirst+""+revLast);
	}
}