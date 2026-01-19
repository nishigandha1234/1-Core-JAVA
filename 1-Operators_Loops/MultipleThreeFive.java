import java.util.*;

public class MultipleThreeFive
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.println(num%5==0 && num % 3 ==0 ? (num )+" IS MULTIPLE OF BOTH" : (num)+" IS NOT MULTIPLE OF BOTH");
	}
}