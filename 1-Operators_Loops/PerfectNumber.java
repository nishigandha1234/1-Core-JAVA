import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println(num%10 == 0 || num%10 == 1 || num%10 == 4 ||  num%10 == 5 || num%10 == 6 ||  num%10 == 9 ? (num)+" The Number is Perfect Number" : (num)+" The Number is NOT Perfect Number");
	}
}