import java.util.*;

public class NegativeOrPositive
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.println(num < 0 ? (num)+ " This is Negative Number" : num > 0 ? (num)+ " This is Positive Number" : (num)+ " This is Zero");
	}
}