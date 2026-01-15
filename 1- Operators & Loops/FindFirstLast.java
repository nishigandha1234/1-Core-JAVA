import java.util.*;

class FindFirstLast
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int first = num/100;
		int last = num % 10;
		
		System.out.println("First : " + first);
		System.out.println(" Last : " +last);
	}
}