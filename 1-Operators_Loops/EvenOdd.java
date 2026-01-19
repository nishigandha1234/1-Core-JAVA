import java.util.*;

public class EvenOdd
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.println(num%2==0 ? (num )+" is EVEN" : (num )+" is ODD");
	}
}