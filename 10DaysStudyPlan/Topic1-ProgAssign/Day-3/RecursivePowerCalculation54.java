/*54 Recursive power calculation*/

import java.util.Scanner;
class RecursivePowerCalculation54
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int base = sc.nextInt();
		System.out.println("Enter Index : ");
		int index = sc.nextInt(); 
		System.out.print("Power : " + power(base, index));
	}
	public static int power(int base, int index)
	{
		if(index != 0)
		{
			return base*power(base, --index);
		}
		return 1;
	}
}