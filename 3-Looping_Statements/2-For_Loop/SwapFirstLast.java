import java.util.Scanner;

class SwapFirstLast
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int temp = n, first, last, mid, x=1;
		
		for(; temp!=0 ; temp/=10)
		{
			x *= 10;
		}
		first = n / x;
		last = n % 10;
		mid = (n%x)/10;
		
		n = last*x + mid*10+first;
		System.out.println(n);
	}
}
		
		