import java.util.*;

public class MultipleFiveEleven
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.println(num%5==0 && num%11==0 ? (num )+" IS MULTIPLE OF BOTH" : num%5==0 ? (num)+" IS MULTIPLE OF 5 ONLY" : (num)+" IS MULTIPLE OF 11 ONLY" );
	}
}