import java.util.*;

class SumOfFirstLast
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int first = num/100;
		int last = num % 10;
		
		int sum = first + last;
		
		System.out.println(" Sum of First & Last : " + sum);
	}
}