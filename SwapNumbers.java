import java.util.*;

public class SwapNumbers
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Number A & B : ");
		int a = sc.nextInt(); //10
		int b = sc.nextInt(); //20
		
		a = a-b; // 10
		//System.out.println(a);
		b = a+b; // 30
		//System.out.println(b);
		a = a-b; //20
		//System.out.println(a);
	
		System.out.println("a : "+ -a);
		System.out.println("b : "+ b);
	}
}