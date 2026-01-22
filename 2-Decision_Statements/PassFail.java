import java.util.*;

public class PassFail
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage : ");
		int percentage = sc.nextInt();
		
		if(percentage >= 40) System.out.println((percentage)+" Pass");
		else System.out.println((percentage)+" Fail");
	}
}